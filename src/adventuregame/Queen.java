package adventuregame;

public class Queen extends Character {
    public Queen() {
        weapon = new KnifeBehaviour();
    }
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
