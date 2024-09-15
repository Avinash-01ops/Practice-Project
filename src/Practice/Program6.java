//HCF
package Practice;
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter value of x: ");
        Scanner s1=new Scanner(System.in);
        x=s1.nextInt();
        System.out.println("Enter value of y: ");
        y=s1.nextInt();

        // Calculate HCF (GCD) using the Euclidean algorithm
        int hcf = gcd(x, y);
        // Output the result
        System.out.println("HCF of " + x + " and " + y + " is: " + hcf);
    }
    public static int gcd(int x, int y) {
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;
    }

}
