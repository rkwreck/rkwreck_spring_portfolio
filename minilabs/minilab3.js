// create class with 2 parameters
public class minilab3 {
    // Use De Morgan distribution
    // at least one if else statement
    public void report (String weather, int temp) {
        if (weather.equals("snowy") && temp <= 32) {
            System.out.println("Schools are closed today. The temperature is " + temp + " degrees Farenheight, and it is " + weather + " today.");
        }
    else if !(weather.equal("sunny") || temp > 50) {
            System.out.println("Wear a jacket! The temperature is " + temp + " degrees Farenheight, and it is " + weather + " today.");
        }
    else if !(weather.equals("cloudy") || temp > 69) {
            System.out.println("Nice weather today. The temperature is " + temp + " degrees Fareneheight, and it is " + weather + " today.");
        }
    else {
        System.out.println("Weird weather we're having. The temperature is " + temp + " degrees Farenheight, and it is " + weather + " today.");
        }
    }

    public static void main(String[] args) {
        minilab3 today = new minilab3();
        today.report("hailing", 13);
    }
}

 // college board question:
 // What output would this function have?
 // a. Schools are closed today. The temperature is 13 degrees Farenheight, and it is hailing today.
 // b. Wear a jacket! The temperature is 13 degrees Farenheight, and it is hailing today.
 // c. Nice weather today. The temperature is 13 degrees Fareneheight, and it is hailing today.
 // d. Weird weather we're having. The temperature is 13 degrees Farenheight, and it is hailing today.


