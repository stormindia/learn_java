public class Human {
    String name;
    int age;
    double weight;
    int id;
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //overloaded constructor
    Human(String name, int age, double weight,int id){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.id = id;
    }

    void eat(){
        System.out.println(this.name + " eat method");
    }
    void eat(int id){
        System.out.println(this.name + " eat method id is " + this.id);
    }
}