package adventuregame;

public class King extends Character{
    public King() {
        weapon = new SwordBehaviour();
    }
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
