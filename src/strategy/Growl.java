package strategy;

public class Growl implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("This is a growl");
    }
}
