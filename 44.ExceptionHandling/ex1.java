import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        // exception = an event that occurs during the execution of a programme that
        //             distrupts the normal flow of instructions


        Scanner scanner = new Scanner(System.in);

        
        try {
            
            System.out.println();
            System.out.print("Enter a whole number to devide : ");
            int x = scanner.nextInt();
            System.out.println();

            System.out.print("Enter a whole number to devide  by : ");
            int y = scanner.nextInt();
            System.out.println();


            int z = x/y;

            System.out.println("Result : " + z );

            System.out.println();
        }

        catch (ArithmeticException e){
            System.out.println("You Can't Devide By Zero...!!!");

        }

        catch (InputMismatchException e){
            System.out.println("Please Enter a whole number ...!!!");
        }

        catch (Exception e) {
            System.out.println("Something went wrong...!!");
        }

        finally{
           scanner.close();
        }

    }
}