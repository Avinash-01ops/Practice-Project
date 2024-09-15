//Program to swap two numbers
package Practice;
import java.util.Scanner;   //Importing java scanner class
public class Program2 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter value of x: ");
        Scanner s1=new Scanner(System.in);      //Created a scanner object
        x=s1.nextInt();                         //Reading the int input using scanner obj created above
        System.out.println("Enter value of y: ");
        Scanner s2=new Scanner(System.in);
        y=s2.nextInt();

        // Swapping the values
        System.out.println(" ");
        System.out.println("We are swapping the values of x and y");
        int temp=x;
        x=y;
        y=temp;
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+temp);

    }

}
