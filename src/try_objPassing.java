class try_objPassing{

    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("abc");
        garage.park(car1);
        Car car2 = new Car("def");
        garage.park(car2);

    }
}