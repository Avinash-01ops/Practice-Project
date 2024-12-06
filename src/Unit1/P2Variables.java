package Unit1;
public class P2Variables {
    //This Code is for Variables
    /*
    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false
     */
    public static void main(String[] args) {
        //Variables
        int a = 10;
        float b = 20.5F;
        char c = 'A';
        String d = "Hello Java";
        boolean e = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //Create a variable called myNum of type int and assign it the value 15:
        int myNum;
        myNum = 10;
        System.out.println(myNum);

        //use the + character to add a variable to another variable
        String car = "BMW M5 Competition";
        System.out.println("My fav car is " + car);

        String firstName = "John";
        String lastName = "Smith";
        System.out.println("Full name:" + firstName + " " + lastName);

        //Assign same value to multiple variables
        int x,y,z;
        x=y=z=50;
        System.out.println(x+y+z);
    }
}

class Var1{
    public static void main(String[] args) {
        //Local variable scope exists within the block only
        int a = 10;
        System.out.println("value of a is: "+a);
    }
}

class Var2 {
    //Declaring instance variables
    public int x;
    public float y;
    public String z;

    public Var2() {
        //Constructor
        //Initializing instance variable
        this.x = 10;            // Default value: 0
        this.z = "Hello Java";  // Default value: null
        this.y = 20.5F;         // Default value: 0
    }

    //L1Basics.Main method
    public static void main(String[] args) {
        //Creating object
        Var2 name = new Var2();

        //Output
        System.out.println("value of x is: " + name.x);
        System.out.println("value of y is: " + name.y);
        System.out.println("value of z is: " + name.z);
    }
}

class Var3{
    //Declaring a static variable
    public static String q = "Avi";
    public static void main(String[] args) {
        //Static variables can be accessed without object creating
        System.out.println("Hello "+ Var3.q);
    }
}
