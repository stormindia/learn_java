class try_object{
    public static void main(String[] args){
        Car myCar = new Car("car1");

        myCar.drive();
        myCar.brake();
        System.out.println(myCar.make);
        System.out.println(myCar.year);
        System.out.println(myCar.type);
    }
}