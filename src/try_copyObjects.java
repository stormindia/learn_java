class try_copyObjects{
    public static void main(String[] args){
        encapsulatedCar car1 = new encapsulatedCar("abc","def",2020);
        encapsulatedCar car2 = new encapsulatedCar("asd","fgh",2021);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();


        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();

        car2.copy(car1);
        System.out.println(car2);
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();

        encapsulatedCar car3 = new encapsulatedCar(car1);
        System.out.println(car3);
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());

    }
}