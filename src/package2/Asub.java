/*
public: visible in all classes in all packages
protected: visible to all classes in the same package or classes in other packages that are a subclass
default: visible to all classes in the same package
private: visible only in the same class
*/

package package2;
import package1.*;

public class Asub extends A {
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.defaultMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage); // no error inherited class can access protected in a different package as well
    }
}
