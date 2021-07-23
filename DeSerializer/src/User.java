import java.io.Serializable;

public class User implements Serializable  {
    String name;
    String password;
    transient String transientPassword;


    public void sayHello(){
        System.out.println("name " + name);
    }
}
