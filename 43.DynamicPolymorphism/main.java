import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        // polumorphism = many shapes/forms
        //dynamic = after compilation (during runtime)

        // ex. A corvette is a: corvette, and a car, and an object 

        Scanner scanner = new Scanner(System.in);
        
        Animal animal;

        System.out.println();
        System.out.println("what animal do you want ?");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println();
        System.out.print("Answer :  ");
        
        int choice = scanner.nextInt();
        
        System.out.println();

        switch (choice){
            case 1:
            animal = new Dog();
            animal.speak();
            System.out.println();
            System.out.println();
            break;

            case 2:

            animal = new Cat();
            animal.speak();
            System.out.println();
            System.out.println();
            break;

            default :
            
            break;

        }
    
    
    }
}
