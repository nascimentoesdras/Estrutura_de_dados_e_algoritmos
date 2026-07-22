public class Operators {
    public static void main(String[] args){
        /*
        * In Java, exists some types of operators that have different behavior:
        * they are the arithmetics, assignment, comparison, logical and bitwise operators.
        *
        * Let's take a look at him.
        *
        */

        //  First are the Arithmetic operators

        // The "+" operator
        // We can use it to make an addition operation. See the example bellow

        int x = 10;
        int y = 10;

        int addXY = x + y;

        System.out.println("First example " + addXY); // the result is 20.

        // We can also add a numeric variable with a static number, like in next example:

        System.out.println("Second example: make an addition between a variable a a static number: " + (addXY + 20));

        // The "-" operator
        // We can use it to make a subtraction operation.

        y = 5; // change the variable value to match with the operation bellow

        int subXY = x - y;
        System.out.println("In this example we have a substraction operation and this result is: " + subXY);

        // The "*" operator
        // we use this to make a multiplication between two or more variables.

        int multiXY = x * y;
        System.out.println("This is a multiplication between X and Y variables and this result is " + multiXY);
    }
}
