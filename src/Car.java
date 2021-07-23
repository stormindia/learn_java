public class Car extends Vehicle{
    String make = "abcd";
    String type = "def";
    int year = 2020;
    String color = "blue";
    double price = 5000.00;
    String  name;

    Car(String name){
        this.name = name;
    }
    Car(){
        this.name = "default car";
    }

    void drive(){
        System.out.println("111111111");
    }
    void brake(){
        System.out.println("2222222");
    }
    void go(){
        System.out.println("car go");
    }

    //overrides the go_override method of vehicle
    void go_override(){
        System.out.println("go car");
    }

    //overloading toString method
    public String toString(){
        return  make + "\n" + type + "\n" + year + "\n" + color + "\t" + price;
    }
}

class newCar extends abstractVehicle{

    @Override
    void abstractgo() {
        System.out.println("go method newCar");
    }
}

class encapsulatedCar{

    private String make;
    private String model;
    private int year;

    encapsulatedCar(String make, String model, int year){
        this.setMake(make); //this.make = make;
        this.setModel(model); //this.model = model;
        this.setYear(year); //this.year = year;
    }

    encapsulatedCar(encapsulatedCar car){
        this.copy(car);

//        this.setMake(car.getMake());
//        this.setModel(car.getModel());
//        this.setYear(car.getYear());
    }

    public String getMake(){
        return  this.make;
    }
    public String  getModel(){
        return  model;
    }
    public int getYear(){
        return  year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void copy(encapsulatedCar car){
        this.setMake(car.getMake()); //this.make = car.make;
        this.setModel(car.getModel()); //this.year = car.year;
        this.setYear(car.getYear()); //this.model = car.model;
    }

}