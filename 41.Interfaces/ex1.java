public class ex1 {
    public static void main(String[] args) {
        
        // interface = a template that can be applied to a class
        //             Similar to inheritance, but specifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limited to 1 super
 
        Rabbit rabbit = new Rabbit();

        Hawk hawk = new Hawk();


        rabbit.flee();
        hawk.hunt();
    }
}
