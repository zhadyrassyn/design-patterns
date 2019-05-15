package strategy;

public class NormalDiet implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("This is a normal diet");
    }
}
