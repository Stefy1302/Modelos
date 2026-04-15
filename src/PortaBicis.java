public class PortaBicis extends AccesoriosDecorator {
    public PortaBicis(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Porta Bicicletas";
    }

    @Override
    public double costo() {
        return super.costo() + 910000.0;
    }
    
}
