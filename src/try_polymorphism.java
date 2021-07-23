import java.util.InputMismatchException;
import java.util.Scanner;

class try_polymorphism{
    public static void main(String[] args){

        //polymorphism - ability of object to identify as more than one type

        Car car = new Car(); // object identifies as instance of Car
        Bicycle bicycle = new Bicycle(); // object identifies as instance of Bicycle
        Boat boat = new Boat(); // // object identifies as instance of Boat

        Vehicle[] vehicles = {car, bicycle, boat}; // all 3 object identifies as instance of Vehicle

        for(Vehicle x: vehicles){
            x.go();
        }
    }
}

class try_dynamicPolymorphism{
    //during run time
    public static void main(String[] args){
        Animal animal;
        System.out.println("1 for dog / 2 for cat/ 3 for default");
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                animal = new Dog();
                animal.speak();
            }
            else if (choice == 2) {
                animal = new Cat();
                animal.speak();
            }
            else if (choice == 3) {
                animal = new Animal();
                animal.speak();
            }
            else {
                throw new InputMismatchException("number should be between 1 and 3");
            }
        }
        catch (InputMismatchException e){
            //System.out.println(e.getCause());
            System.out.println("dsadasdsf");
        }

    }
}