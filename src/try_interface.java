class try_interface{
    public static void main(String[] args){
        // interface - a template that can be applied to a class
        // similar to inheritance but specifies what a class has/must do
        // classes can implement more than one interface

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();


    }
}