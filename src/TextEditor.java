public class TextEditor {
    private String contenido;

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public TextMemento guardar() {
        return new TextMemento(contenido);
    }

    public void restaurar(TextMemento memento) {
        if (memento != null) {
            this.contenido = memento.getEstadoGuardado();
        }
    }
}