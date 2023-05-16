public class ex1 {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/ method is created and shared.
        //          the class "owns" the static number
        
        Friend friend1 = new Friend("Sponegbob");
        Friend friend2 = new Friend("Kaali");

        Friend.display();
    }
}
