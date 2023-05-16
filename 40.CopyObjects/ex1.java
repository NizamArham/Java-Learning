public class ex1 {

    public static void main(String[] args) {
        
        Car car1 = new Car("BMW", "i8" , "Pink", 2020);
        // Car car2 = new Car("Benz", "CLA200" , "Red", 2018);
        Car car2 = new Car(car1);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getmake());
        System.out.println(car1.getmodel());
        System.out.println(car1.getcolor());
        System.out.println(car1.getyear());
        System.out.println();
        System.out.println(car2.getmake());
        System.out.println(car2.getmodel());
        System.out.println(car2.getcolor());
        System.out.println(car2.getyear());


    }

}
