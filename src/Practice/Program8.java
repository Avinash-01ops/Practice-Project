//Vowel or Consonant
package Practice;
import java.util.Objects;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
            String s;
        System.out.println("Enter a char: ");
        Scanner s1=new Scanner(System.in);
        s = s1.next();
        System.out.println(s);

        if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
            System.out.println("Entered char "+s+" is a vowel");
        } else{
            System.out.println("Entered char "+s+" is a consonant");
        }
    }
}
