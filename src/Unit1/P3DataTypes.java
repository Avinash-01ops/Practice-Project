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
    int mynum = 10;
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
        System.out.printf("Character: "+mychar);

        byte mybyte1 = 100;
        System.out.println("Byte :"+mybyte1);
        short myshort1 = 5000;
        System.out.println("Shor :"+myshort1);
        int myint1 = 50000;
        System.out.println("Int :"+myint1);
        long mylong1 = 10000000000L;
        System.out.println("Long :"+mylong1);
        float myfloat1 = 5.75f;
        System.out.println("Float :"+myfloat1);
        double mydouble1 = 5.75;
        System.out.println("Double :"+mydouble1);
        boolean Areyouhappy1 = true;
        boolean Areyounothappy1 = false;
        System.out.println("Boolean1 :"+Areyouhappy1);
        System.out.println("Boolean2 :"+Areyounothappy1);
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

    }
}

class P3DataTypes {
    //Primitive and Non-Primitive
    public static void main(String[] args) {
        /*Integer data types: byte, short, int and long
         Floating point data types: long and double*/

        byte var1 = 10;    //can store from -128 to 127
        System.out.println("Value of byte type var is: " + var1);

        short var2 = 100;   //can store from -32768 to 32767
        System.out.println("Value of short type var is: " + var2);

        int var3 = 1000;     //can store from -2147483648 to 2147483647
        System.out.println("Value of int type var is: " + var3);

        long var4 = 10000000;       //from -9223372036854775808 to 9223372036854775807
        System.out.println("Value of long type var is: " + var4);

        float var5 = 10.0f;     //precision of float is only six or seven decimal digits.
        System.out.println("Value of float type var is: " + var5);

        double var6 = 10000.99d;    //precision of double about 16 decimal digits.
        System.out.println("Value of double type var is: " + var6);

        //Boolean datatype
        boolean bool1 = true;
        System.out.println(bool1);
        boolean bool2 = false;
        System.out.println(bool2);

        //Char datatype
        char a = 'A';
        System.out.println("Value of char type" + a);

        //String datatype
        String greetings = "Hello World";
        System.out.println(greetings);
    }
}

