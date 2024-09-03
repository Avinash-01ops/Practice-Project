package Unit1;

public class P6Operators {
    //This program is created for Java Operators

    public static void main(String[] args) {
        /*  Java divides the operators into the following groups:
            Arithmetic operators
            Assignment operators
            Comparison operators
            Logical operators
            Bitwise operators

        Arithmetic operators
        NAME            Description                 EXAMPLE
        Addition        Adds together two values    x + y
        Subtraction     Subtracts two values        x - y
        Multiplication  Multiplies two values       x * y
        Division        Divides two values          x / y
        Modulus         Returns the remainder        x % y
        Increment       Adds 1 to a value           x++
        Decrement       Subtracts 1 from a value    x--
         */

        int x = 10;
        int y = 5;
        System.out.println("Increment Operator: "+x++);
        System.out.println("Decrement Operator: "+x--);
        System.out.println("Addition Operator: "+(x+y));
        System.out.println("Subtraction Operator: "+(x-y));
        System.out.println("Multiplication Operator: "+(x*y));
        System.out.println("Division Operator: "+(x/y));
        System.out.println("Modulus Operator: "+(x%y));


        //Assignment operator
        int num = 10;
        System.out.println("Num value: "+num);

        /*Comparison Operator
        NAME                        Description                                             EXAMPLE
        Equal to                    Checks if two values are equal                          x == y
        Not equal to                Checks if two values are not equal                      x != y
        Less than                   Checks if one value is less than another                x < y
        Less than or equal to       Checks if one value is less than or equal to another    x <= y
        Greater than                Checks if one value is greater than another             x > y
        Greater than or equal to    Checks if one value is greater than or equal to another x >= y
         */

        int x1 = 5;
        int y1 = 3;
        System.out.println(x1 > y1); // returns true, because 5 is higher than 3

        /*Logical Operators
        Operator    Name            Description	                                Example
        && 	        Logical and	    Returns true if both statements are true	x < 5 &&  x < 10
        || 	        Logical or	    Returns true if one of the statements is true	x < 5 || x < 4
        ! 	        Logical not	    Reverse the result, returns false if the result is true !x<5


        Bitwise operators
        Operator    Name            Description	                                    Example
        & 	        AND	            Sets each bit to 1 if both bits are 1	        x & y
        | 	        OR	            Sets each bit to 1 if one of two bits is 1	    x | y
        ^ 	        XOR	            Sets each bit to 1 if only one of two bits is 1	x ^ y
        ~ 	        NOT	            Inverts all the bits of the number	            ~x
         */

    }
}
