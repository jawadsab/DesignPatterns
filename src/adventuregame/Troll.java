package adventuregame;

public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehaviour();
    }
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
