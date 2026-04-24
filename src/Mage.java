public class Mage extends GameCharacter {
    public Mage(String name, int level, int hp, int energy) {
        super(name, "Mago", level, hp, energy);
    }

    public Mage(Mage target) {
        super(target);
    }

    @Override
    public GameCharacter clone() {
        return new Mage(this);
    }
}