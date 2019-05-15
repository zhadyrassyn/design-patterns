package strategy;

public class DogSimulatorApp {

    public static void main(String[] args) {
        Dog lab = new Labrador();
        lab.doEat();
        lab.setEatBehavior(new ProteinDiet());
        lab.doEat();
    }
}
