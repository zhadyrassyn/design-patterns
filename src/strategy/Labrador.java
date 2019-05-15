package strategy;

public class Labrador extends Dog {

    public Labrador() {
        barkBehavior = new PlayfulBark();
        eatBehavior = new NormalDiet();
    }

    public void display(){
        System.out.println("I'm a playful Labrador");
    }
}
