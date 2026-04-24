public class Warrior extends GameCharacter {
    public Warrior(String name, int level, int hp, int energy) {
        super(name, "Guerrero", level, hp, energy);
    }

    public Warrior(Warrior target) {
        super(target);
    }

    @Override
    public GameCharacter clone() {
        return new Warrior(this);
    }
}