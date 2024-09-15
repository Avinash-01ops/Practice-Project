//Check for ODD or EVEN
package Practice;
import java.util.Scanner;       //Importing java scanner class
public class Program3 {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter value of x: ");
        Scanner s1=new Scanner(System.in);
        x=s1.nextInt();
        //Lets check if entered value is ODD or EVEN
        if(x%2==0){
            System.out.println("Entered value is EVEN: "+x);
        }else{
            System.out.println("Entered value is ODD: "+x);
        }
    }
}
