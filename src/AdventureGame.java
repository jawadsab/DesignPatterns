import adventuregame.Character;
import adventuregame.*;

public class AdventureGame {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new BowAndArrowBehaviour());
        queen.fight();
        Character king = new King();
        king.fight();
        king.setWeapon(new KnifeBehaviour());
        king.fight();
        Character knight = new Knight();
        knight.fight();
        knight.setWeapon(new SwordBehaviour());
        knight.fight();
        Character troll = new Troll();
        troll.fight();
        troll.setWeapon(new KnifeBehaviour());
        troll.fight();
    }
}
