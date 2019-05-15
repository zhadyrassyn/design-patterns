package strategy;

public class ProteinDiet implements EatBehavior{
    @Override
    public void eat() {
        System.out.println("This is a protein diet");
    }
}
