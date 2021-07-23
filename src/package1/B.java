/*
public: visible in all classes in all packages
protected: visible to all classes in the same package or classes in other packages that are a subclass
default: visible to all classes in the same package
private: visible only in the same class
*/

package package1;
import package2.*;

public class B {
    private String privateMessage = "private string"; // only visible in same class
}