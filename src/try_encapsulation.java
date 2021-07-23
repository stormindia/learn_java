class try_encapsulation{
    public static void main(String[] abcd){
        // Encapsulation - attributes of a class will be hidden or private
        //                 can be accessed only through methods (getters and setters)
        //                 make attributes private if you don't have reason to make them public/protected


        encapsulatedCar car = new encapsulatedCar("abc", "def", 2020); //This is fine even without getter and setter
        // System.out.println(car.make); //error without getter and setter
        System.out.println(car.getMake() + "\t" + car.getModel() + "\t" + car.getYear());

        car.setYear(2030);

        System.out.println(car.getMake() + "\t" + car.getModel() + "\t" + car.getYear());
    }
}