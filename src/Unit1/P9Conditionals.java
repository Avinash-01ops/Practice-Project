package Unit1;

public class P9Conditionals
{
    //This program is created for Conditionals
    public static void main(String[] args)
    {

        //if statement
        int x = 10;
        int y = 5;
        if(x>y)
        {
            System.out.println("X is greater than Y: "+x);
        }

        //if-else statement
        if(x>y){
            System.out.println("X is greater than Y: "+x);
        }
        else{
            System.out.println("Y is greater than X: "+y);
        }

        //if-else ladder
        if (1<0)
        {
            System.out.println("Test message 1");
        } else if (2<0)
        {
            System.out.println("Test message 2");
        } else if (3<0){
            System.out.println("Test message 3");
        } else {
            System.out.println("Test message 4");
        }

        //Shorthand if statement
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        //Testing a positive number using if else
        int num = 10;
        if (num > 0) {
            System.out.println("Num is a positive number");
        } else if (num<0) {
            System.out.println("Num is a negative number");
        }else {
            System.out.println("Num is zero");
        }
    }
}
