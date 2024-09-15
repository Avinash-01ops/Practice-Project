//Leap year
package Practice;
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter year: ");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();

        if(x%4==0){
            System.out.println("Entered year is a Leap year: "+x);
        }else{
            System.out.println("Entered year is not a Leap year: "+x);
        }
    }
}
