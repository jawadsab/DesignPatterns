package adventuregame;

public class Knight extends Character {
    public Knight() {
        weapon = new BowAndArrowBehaviour();
    }
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
