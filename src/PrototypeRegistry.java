import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, GameCharacter> prototypes = new HashMap<>();

    public void addPrototype(String key, GameCharacter prototype) {
        prototypes.put(key, prototype);
    }

    public GameCharacter getPrototype(String key) {
        GameCharacter prototype = prototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}