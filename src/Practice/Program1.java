//Read and Print an Integer value in Java
package Practice;
import java.util.Scanner;   //Imported java scanner class
public class Program1 {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter value of i: ");
        Scanner s1=new Scanner(System.in);
        i=s1.nextInt();
        System.out.println("Enter value of j: ");
        Scanner s2=new Scanner(System.in);
        j=s2.nextInt();

        System.out.println("Addition: "+(i+j));
        System.out.println("Subtraction: "+(i-j));
        System.out.println("Multiplication: "+(i*j));
        System.out.println("Division: "+(i/j));
        System.out.println("Remainder: "+(i%j));

        //Table of i
        System.out.println(" ");
        System.out.println("This is table of i");
        for(int a=1;a<=i;a++){
            System.out.println(a*i);
        }
        //Table of j
        System.out.println(" ");
        System.out.println("This is table of j");
        for(int b=1;b<=j;b++){
            System.out.println(b*j);
        }

        //Pattern
        System.out.println(" ");
        System.out.println("Star Pattern 1");
        for(int c=1;c<=i;c++){
            for(int d=1;d<=c;d++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Multiplication of two float numbers
        System.out.println(" ");
        System.out.println("Multiplication of two float values f1 and f2");
        float f1=1.5f;
        float f2=2.5f;
        System.out.println("f1 * f2 = "+(f1*f2));

    }
}
