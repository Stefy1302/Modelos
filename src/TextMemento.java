public class TextMemento {
    private final String estado;

    public TextMemento(String estado) {
        this.estado = estado;
    }

    public String getEstadoGuardado() {
        return estado;
    }
}