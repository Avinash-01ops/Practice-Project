package Unit1;

public class P11Loops {
    public static void main(String[] args)
    {//While loop program
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //Do While Loop
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x < 5);

        int countdown = 10;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        //Print "Yatzy!" If the dice number is 6:
        int dice = 0;
        while (dice <= 6) {
            if (dice == 6) {
                System.out.println("Yatzy!");
            } else {
                System.out.println(dice);
            }
            dice = dice + 1;
        }

        //For Loop
        for (int a = 0; a <= 5; a++) {
            System.out.println(a);
        }

        //For Loop to print even values only
        for (int b = 0; b <= 10; b = b + 2) {
            System.out.println(b);
        }

        //Nested Loop
        for (int x1 = 0; x1<= 2; x1++) {
            System.out.println("x1=" + x1);
            for (int y = 0; y <= 2; y++) {
                System.out.println("y=" + y);
            }
        }

        //For Each Loop
        String[] cars = {"BMW", "Volvo", "Ford", "Mercedes"};
        for (String i2 : cars) {
            System.out.println(i2);
        }

        //Create a program that counts to 100 by tens:
        for (int count = 0; count <= 100; count = count + 10) {
            System.out.println(count);
        }

        for (int count1 = 200; count1 >= 100; count1 = count1 - 10) {
            System.out.println(count1);


            String[] str1 = {"a", "b", "c", "d"};
            for (String i1 : str1) {
                System.out.println(i1);
            }
        }
        //Break
        for (int e=0;e<=10;e=e+1){
            System.out.println(e);
            if(e==5){break;}

        }

        //Continue
        for (int f=0;f<=10;f=f+1){
            if(f==5){continue;}
            System.out.println(f);
        }

    }
}

