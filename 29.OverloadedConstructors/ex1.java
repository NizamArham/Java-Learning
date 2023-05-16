public class ex1 {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza ("thick crust","tomato");
        Pizza pizza3 = new Pizza ("thick crust","tomato","mozzerella","paporoni"); 

        System.out.println("Here are the ingredients;");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);


        System.out.println("Here are the ingredients;");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.topping);
    }
}
