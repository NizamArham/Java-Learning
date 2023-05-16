package package2;

import package1.*;

public class Asub extends A {

  public static void main(String[] args) {
    // C c1 = new C();
    //C c2 = new C();

    Asub asub = new Asub();
            
    // System.out.println(c2.defaultMessage); As this is not an public so we cant use it from outside pckg
    
    //System.out.println(c1.publicMessage);
    System.out.println(asub.protectedMessage);
}

    

}
