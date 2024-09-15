//Find out the largest values out of three
package Practice;
import java.util.Scanner;       //Importing java scanner class
public class Program4 {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter value of x: ");
        Scanner s1=new Scanner(System.in);
        x=s1.nextInt();
        System.out.println("Enter value for y: ");
        Scanner s2=new Scanner(System.in);
        y=s2.nextInt();
        System.out.println("Enter value for z: ");
        Scanner s3=new Scanner(System.in);
        z=s3.nextInt();

        //Checking for largest number
        if(x>y){
            if(x>z){
                System.out.println("X is the largest");
            }
        }
        if(y>x){
            if(y>z){
                System.out.println("Y is the largest");
            }
        }
        if(z>x){
            if(z>y){
                System.out.println("Z is the largest");
            }
        }
    }
}
