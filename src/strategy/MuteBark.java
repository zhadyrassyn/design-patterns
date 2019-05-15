package strategy;

public class MuteBark implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("This is a mute bark");
    }
}
