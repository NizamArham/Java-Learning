public class ex1{
    public static void main(String[] args) {

        //OverLoadingMethod = method that share the same name but have different parameters 
        //                    method name + parameter = method signature

    
        System.out.println(add(3,6,20,1));

    }

    static int add (int a, int b){
        System.out.println("This is overloded method #1");
        return a + b ;
    }

    static int add (int a, int b, int c){
        System.out.println("This is overloded method #2");
        return a + b + c ;
    }

    static int add (int a, int b, int c, int d){
        System.out.println("This is overloded method #3");
        return a + b + c + d;
    }
}
