public class Fish implements Prey,Predator{

    @Override
    public void hunt() {
        System.out.println("Fish hunt");
    }

    @Override
    public void flee() {
        System.out.println("Fish flee");
    }
}