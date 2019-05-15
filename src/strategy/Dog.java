package strategy;

public abstract class Dog {
    EatBehavior eatBehavior;
    BarkBehavior barkBehavior;

    public void doBark() {
        barkBehavior.bark();
    }

    public void doEat() {
        eatBehavior.eat();
    }

    public void setEatBehavior(EatBehavior eb) {
        eatBehavior = eb;
    }

    public void setBarkBehavior(BarkBehavior bb) {
        barkBehavior = bb;
    }
}
