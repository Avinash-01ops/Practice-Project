package Practice;
import java.util.Scanner;

public class P1Basics {
    public static void main(String[] args) {
        //Ex1-1Write a Java program to print 'Hello' on screen and your name on a separate line.
        System.out.println("Hello World");
        System.out.println("My name is Avinash");

        //Ex2-Perform below given calculations
        int x;
        x=-5+8*6;
        System.out.println(x);
        int y;
        y=(55+9) % 9;
        System.out.println(y);

        //Ex3-Input and display product of two numbers.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = in.nextInt();
        System.out.println("Enter number b: ");
        int b = in.nextInt();
        System.out.println("Multiplication of a and b: "+a*b);

        //Ex4-Input and print the sum (addition), multiply, subtract, divide and remainder of two numbers
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter number x: ");
        int x1 = in1.nextInt();
        System.out.println("Enter number y: ");
        int y1 = in1.nextInt();
        System.out.println("Sum: "+(x1+y1));
        System.out.println("Multiplication: "+(x1*y1));
        System.out.println("Subraction: "+(x1-y1));
        System.out.println("Division: "+(x1/y1));
        System.out.println("Remainder: "+(x1%y1));

        //Ex5-Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Scanner in2 =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = in2.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*num1);
        }
        //Ex6-Print you initial using 0
        System.out.println("    0  ");
        System.out.println("   0 0 ");
        System.out.println("  00000");
        System.out.println(" 0     0");
        System.out.println("0       0");

    }
}
