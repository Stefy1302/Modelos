public abstract class GameCharacter implements Prototype {
    protected String name;
    protected String characterClass;
    protected int level;
    protected int hp;
    protected int energy;

    public GameCharacter(String name, String characterClass, int level, int hp, int energy) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.hp = hp;
        this.energy = energy;
    }

    public GameCharacter(GameCharacter target) {
        if (target != null) {
            this.name = target.name;
            this.characterClass = target.characterClass;
            this.level = target.level;
            this.hp = target.hp;
            this.energy = target.energy;
        }
    }

    @Override
    public abstract GameCharacter clone();

    // Setters para modificar el clon después de crearlo
    public void setName(String name) { this.name = name; }
    public void setLevel(int level) { this.level = level; }

    @Override
    public String toString() {
        return String.format("[%s] %s - Nivel: %d, HP: %d, Energía: %d", 
                characterClass, name, level, hp, energy);
    }
}