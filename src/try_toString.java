class try_toString{
    public static void main(String[] args){

        Car car = new Car("car1");


        System.out.println(car.toString()); //explicitly
        System.out.println(car); //implicitly
    }
}