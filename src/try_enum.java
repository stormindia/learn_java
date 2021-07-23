import java.security.PublicKey;

enum Planet{
    AA(1),
    BB(2),
    CC(3),
    DD(4),
    EE(5);
    int num;
    Planet(int num){
        this.num = num;
    }
}

class try_enum{
    public static void main(String[] args){
        //enum = enumerated (ordered listing of items in a collection)
        //grouping of constants that behave similarly to objects

        Planet myPlanet = Planet.CC;
        testfunc(myPlanet);
    }

    static  void testfunc(Planet myPlanet){
        switch (myPlanet){
            case EE:
                System.out.println("EE value "+myPlanet.num);
                break;
            default:
                System.out.println(myPlanet.toString() + myPlanet.num);//+ myPlanet.num);
                break;
        }
    }
}