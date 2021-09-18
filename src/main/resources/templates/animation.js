/*
window.transitionToPage = function(href) {
    document.querySelector('body').style.opacity = 0
    setTimeout(function() {
        window.location.href = href
    }, 500)
}

document.addEventListener('DOMContentLoaded', function(event) {
    document.querySelector('body').style.opacity = 1
})
 source: https://www.smashingmagazine.com/2016/07/improving-user-flow-through-page-transitions/
*/

var cache = {};
function loadPage(url) {
    if (cache[url]) {
        return new Promise(function(resolve) {
            resolve(cache[url]);
        });
    }

    return fetch(url, {
        method: 'GET'
    }).then(function(response) {
        cache[url] = response.text();
        return cache[url];
    });
}

var main = document.querySelector('main');

function changePage() {
    var url = window.location.href;

    loadPage(url).then(function(responseText) {
        var wrapper = document.createElement('div');
        wrapper.innerHTML = responseText;

        var oldContent = document.querySelector('.cc');
        var newContent = wrapper.querySelector('.cc');

        main.appendChild(newContent);
        animate(oldContent, newContent);
    });
}

function animate(oldContent, newContent) {
    oldContent.style.position = 'absolute';

    var fadeOut = oldContent.animate({
        opacity: [1, 0]
    }, 1000);

    var fadeIn = newContent.animate({
        opacity: [0, 1]
    }, 1000);

    fadeIn.onfinish = function() {
        oldContent.parentNode.removeChild(oldContent);
    };
}

window.addEventListener('popstate', changePage);

document.addEventListener('click', function(e) {
    var el = e.target;

    while (el && !el.href) {
        el = el.parentNode;
    }

    if (el) {
        e.preventDefault();
        history.pushState(null, null, el.href);
        changePage();

        return;
    }
});