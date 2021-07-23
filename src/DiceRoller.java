import java.util.Random;

public class DiceRoller {

    //Global vars
    Random random;
    int number;

    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll(){
        //local var
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}