/*
public: visible in all classes in all packages
protected: visible to all classes in the same package or classes in other packages that are a subclass
default: visible to all classes in the same package
private: visible only in the same class
*/

package package2;
import package1.*;

public class C {
            String defaultMessage = "default string"; // default - can be accessed inside same package
    public  String publicMessage = "public string"; // visible to other packages as well


}
