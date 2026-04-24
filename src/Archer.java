public class Archer extends GameCharacter {
    public Archer(String name, int level, int hp, int energy) {
        super(name, "Arquero", level, hp, energy);
    }

    public Archer(Archer target) {
        super(target);
    }

    @Override
    public GameCharacter clone() {
        return new Archer(this);
    }
    
}
