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
        int a=10; //integer
        String b="hello"; //String
        float c=10.5f; //float
        char d='a'; //char
        boolean e=true; //boolean

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int aa = 10;
        int bb = 20;
        int cc = aa + bb;
        System.out.println(cc);

        //Declaring multiple variables
        int x, y, z;
        x = 10;
        y = 20;
        z = 30;
        System.out.println(x+y+z);
    }
}
