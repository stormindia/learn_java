class try_constructors{
    public static void main(String[] args){
        Human human = new Human("abcd", 20,5.5);
        System.out.println(human.name);
        human.eat();

        Human human1 = new Human("def", 20,5.5,1);
        human1.eat(human1.id);
    }
}