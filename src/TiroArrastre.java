public class TiroArrastre extends AccesoriosDecorator {
    public TiroArrastre(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Tiro de Arrastre";
    }

    @Override
    public double costo() {
        return super.costo() + 810000.0;
    }
    
}
