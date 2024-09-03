package Unit1;

import java.util.Locale;

public class P7Strings {
    //This program is created for String operatoions

    public static void main(String[] args) {
        //Declaring a string
        String mystring = "Hello World!";
        System.out.println(mystring);

        //String Length
        String mystring1 = "HelloWorld!thisisalongstring";
        System.out.println("String Length: "+mystring1.length());

        //String Concatenation
        String onestring = "This is a string one";
        String twostring = "This is a string two";
        String threestring = onestring+twostring;
        System.out.println("Concatenated String: "+threestring);
        System.out.println("Concatenated String Length: "+threestring.length());

        //UpperCase Method
        System.out.println(threestring.toUpperCase());

        //LowerCase Method
        System.out.println(threestring.toLowerCase());
    }
}
