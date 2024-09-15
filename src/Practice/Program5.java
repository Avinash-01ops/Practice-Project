//LCM of two numbers
package Practice;
import java.util.Scanner;       //Importing java scanner class
public class Program5 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter value of a: ");
        Scanner s1 = new Scanner(System.in);
        a = s1.nextInt();
        System.out.println("Enter value of b: ");
        Scanner s2 = new Scanner(System.in);
        b = s2.nextInt();

        int ans = (a > b) ? a : b;

        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        // Printing the Result
        System.out.println("LCM of " + a + " and " + b
                + " : " + ans);

    }
}
