import java.util.ArrayList;
import java.util.List;

public class History {
    private List<TextMemento> historial = new ArrayList<>();

    public void añadirMemento(TextMemento m) {
        historial.add(m);
    }

    public TextMemento getMemento(int indice) {
        if (indice >= 0 && indice < historial.size()) {
            return historial.get(indice);
        }
        return null;
    }
    
    public int getCantidadEstados() {
        return historial.size();
    }
}