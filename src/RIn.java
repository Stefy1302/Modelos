public class RIn extends AccesoriosDecorator {
    public RIn(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con Rines de Aleación";
    }

    @Override
    public double costo() {
        return super.costo() + 350000.0;
    }
    
}
