public class Friend {
    
    String name;
    static int numberoffriend;

    Friend (String name){

        this.name = name;

        numberoffriend++;

    }

    static void display(){
        System.out.println("you have "+numberoffriend+" friends.");
    }
}
