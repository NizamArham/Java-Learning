public class ex1{
    public static void main(String[] args) {
        
        //print f = An optional method to control, format, display text to the console window
        //          two arguments = format string + (object/variable/value)
        //          %[flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b" , myBoolean);
        System.out.printf("%c" , myChar);
        System.out.printf("%d" , myInt);
        System.out.printf("%f" , myDouble);
        System.out.printf("%s" , myString);

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("hello %10s", myString);

        // [precision]
        // set number of digits of precision when outputting float-oint values
        System.out.printf("You have this much money %.2f", myDouble);

        //[flags]
        // adds an effect to output based on the flag that added to format specifier
        // - : left justify
        // + : output a plus ( + ) or  ( - ) sign for a numeric value 
        // , : seprates the numbers if > 1,000

    }
}