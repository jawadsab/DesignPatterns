package simuduck;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I Squeak!");
    }
}
