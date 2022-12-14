package simuduck;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){}

    public void performQuack() {
        quackBehaviour.quack();
    }
    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

}
