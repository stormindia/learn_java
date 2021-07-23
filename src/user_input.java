import  java.util.Scanner;

class Input_User {

    public  static  void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your food?");
        String food = scanner.nextLine();


        System.out.println("your name " + name);
        System.out.println("age "+age);
        System.out.println("food "+food);

    }
}