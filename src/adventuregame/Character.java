package adventuregame;

public abstract class Character {
    WeaponBehaviour weapon;
    public abstract void fight();
    public void setWeapon(WeaponBehaviour w) {
        this.weapon = w;
    }
}
