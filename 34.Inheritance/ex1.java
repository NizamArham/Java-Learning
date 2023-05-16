public class ex1 {
    public static void main(String[] args) {

        //inheritance = the process whre one class aquires,
        //              the attributes and methods of another.
        
        Car myCar = new Car();

        myCar.go();
        System.out.println(myCar.speed);

        System.out.println(myCar.doors);
        System.out.println(myCar.wheel);

        Bicycle cycle = new Bicycle();

        cycle.stop();
        System.out.println(cycle.speed);
        System.out.println(cycle.paddles);
        System.out.println(cycle.wheel);
    }
}
