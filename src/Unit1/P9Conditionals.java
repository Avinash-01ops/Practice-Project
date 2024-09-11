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

        //else statement
        int num1 = 10;
        if(num1>100){
            System.out.println("Num1 is greater than 100");
        }else{
            System.out.println("Num1 is less than 100");
        }

        int age = 15;
        if(age>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }

        //elseif ladder

        String Day = "Saturday";
        if(Day == " Monday") {
            System.out.println("Hello, Today is Monday.");
        } else if (Day=="Tuesday") {
            System.out.println("Hello, Today is Tuesday.");
        } else if (Day=="Wednesday") {
            System.out.println("Hello, Today is Wednesday.");
        } else if (Day=="Thursday") {
            System.out.println("Hello, Today is Thursday.");
        } else if (Day=="Friday") {
            System.out.println("Hello, Today is Friday.");
        } else if (Day=="Saturday") {
            System.out.println("Hello, Today is Saturday.");
        } else  {
            System.out.println("Hello, Today is Sunday.");
        }

        //Short Hand ifelse
        int time1 = 20;
        String result1 = (time1 < 18) ? "Good day." : "Good evening.";
        System.out.println(result1);


        //Program to check Odd-Even numbers
        int num3=48753;
        if(num3%2 == 0){
            System.out.println("Num3 is even");
        } else {
            System.out.println("Num3 is odd");
        }


    }
}
