package Practice;
import java.util.*;

public class P2PatternPrograms {
    public static void main(String[] args) {
        /*//Pattern-1
        for (int i=0;i<=5;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        int a,b,num=1;
        for (a=0;a<=4;a++){
            for (b=0;b<=a;b++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
