package strategy;

public class PlayfulBark implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Bark! Bark!");
    }
}
