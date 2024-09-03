package Unit1;

public class P5JavaTypeCasting {
    //This program is created to for Type Casting
    public static void main(String[] args) {
        /*
        Type casting is when you assign a value of one primitive data type to another type.
        In Java, there are two types of casting:

        ->Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

        ->Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte
         */

        //wide casting
        byte mybyte = 5;
        short myshort = mybyte;
        System.out.println(myshort);

        char mychar = 'a';
        int myint = mychar;
        System.out.println(myint);



        //narrowing casting

        long mylong = 5;
        float myfloat = mylong;
        System.out.println(myfloat);

        //narrowing casting
       double mydouble2 = 5.99;
       float myfloat2 = (float) mydouble2;
       System.out.println(myfloat2);

       long mylong2 = 5;
       int myint2 = (int) mylong2;
       System.out.println(myint2);

       char mychar2 = 'a';
       short myshort2 = (short) mychar2;
       System.out.println(myshort2);
    }
}