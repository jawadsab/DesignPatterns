package simuduck;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I can't Quack");
    }
}
