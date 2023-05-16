
public class ex1{
    public static void main(String[] args) {
        
        // Encapsulation = attributes of a class will be hidden or private,
        //                 Can be accessed only through methods (getters and setters)
        //                 you should make attributes private if you dont have a reason to make them private/protected.


        Car car = new Car("BMW", "i8" , "Pink", 2020);

        // getters  
        System.out.println(car.getmake());
        System.out.println(car.getmodel());
        System.out.println(car.getcolor());
        System.out.println(car.getyear());

        //setters
        car.setcolor("Purple");

        System.out.println(car.getcolor());


    }
}
