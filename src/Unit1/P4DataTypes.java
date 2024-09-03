package Unit1;

public class P4DataTypes {
    //This program is created to for Data Types in Java

    /*Primitive Data Types
    A primitive data type specifies the size and type of variable values, and it has no additional methods.
    There are eight primitive data types in Java:

    Data Type	Size	    Description
    byte	    1 byte	    Stores whole numbers from -128 to 127
    short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
    int	        4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
    boolean	    1 bit	    Stores true or false values
    char	    2 bytes	    Stores a single character/letter or ASCII values
     */
    public static void main(String[] args) {
    /*int mynum = 10;
    float myfloat = 10.5f;
    double mydouble = 10.5;
    boolean myboolean = false;
    char mychar = 'a';
    long mylong = 10;
    short myshort = 10;
    byte mybyte = 10;

        //Display Data Types

        System.out.println("Integer: "+mynum);
        System.out.println("Float: "+myfloat);
        System.out.println("Double: "+mydouble);
        System.out.println("Long: "+mylong);
        System.out.println("Byte: "+mybyte);
        System.out.println("Short: "+myshort);
        System.out.println("Boolean: "+myboolean);
        System.out.printf("Character: "+mychar);*/

        byte mybyte = 100;
        System.out.println("Byte :"+mybyte);
        short myshort = 5000;
        System.out.println("Shor :"+myshort);
        int myint = 50000;
        System.out.println("Int :"+myint);
        long mylong = 10000000000L;
        System.out.println("Long :"+mylong);
        float myfloat = 5.75f;
        System.out.println("Float :"+myfloat);
        double mydouble = 5.75;
        System.out.println("Double :"+mydouble);
        boolean Areyouhappy = true;
        boolean Areyounothappy = false;
        System.out.println("Boolean1 :"+Areyouhappy);
        System.out.println("Boolean2 :"+Areyounothappy);
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

    }
}
