//purpose: store basic information that you collected because you're a professional spy

//create a main class
public class Collection {

    //create an information method
    public void information(String name, int age, String color) {
        System.out.print("Your client's name is " + name + "." );
        if (age < 18)        //check if they are a minor or not
        {
            System.out.print(" They're a minor.");
        }
        else
        {
            System.out.print(" They are " + age + " years old.");
        }
        System.out.println(" Their favorite color is " + color + ".");
    }

    //inside Main, call the methods on the client and clientTwo objects
    public static void main(String[] args) {
        Collection client = new Collection();       //create a client object
        client.information("Karen", 30, "white"); //call the information method on the first client
        Collection clientTwo =  new Collection();   //create a second client object
        clientTwo.information("Chad", 14, "blue");  //call the information method on the second client
        Collection clientThree = new Collection();
        clientThree.information("John", 18, "green");
    }
}

