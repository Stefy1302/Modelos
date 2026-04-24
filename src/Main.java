public class Main {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();

        registry.addPrototype("Warrior_Base", new Warrior("Prototipo Guerrero", 1, 150, 50));
        registry.addPrototype("Mage_Base", new Mage("Prototipo Mago", 1, 80, 150));

        GameCharacter warrior1 = registry.getPrototype("Warrior_Base");
        warrior1.setName("Aragorn");
        warrior1.setLevel(10);

        GameCharacter warrior2 = registry.getPrototype("Warrior_Base");
        warrior2.setName("Boromir");

        GameCharacter mage1 = registry.getPrototype("Mage_Base");
        mage1.setName("Gandalf");

        System.out.println("Personajes creados mediante Prototype:");
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println(mage1);
    }
}