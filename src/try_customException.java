import java.util.Scanner;

class try_customException{
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try{
            checkAge(number);
        }
        catch (Exception e){
            System.out.println("A problem occurred " + e);
        }
    }

    static void checkAge(int number) throws CustomException{
        if(number < 18){
            throw new CustomException("age less than 18");
        }
        else{
            System.out.println("age gt that 18");
        }
    }


}