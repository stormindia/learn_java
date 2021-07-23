/*
public: visible in all classes in all packages
protected: visible to all classes in the same package or classes in other packages that are a subclass
default: visible to all classes in the same package
private: visible only in the same class
*/

package package1;
import package2.*;

public class A {

    protected String protectedMessage = "protected string"; // visible to other packages as well only if it is a subclass
    public static void main(String[] args){
        C c = new C();
        // System.out.println(c.defaultMessage); //error
        System.out.println(c.publicMessage); // no error

        B b = new B();
        // System.out.println(b.privateMessage); // error

    }

}
