public class Tapetes extends AccesoriosDecorator {
    public Tapetes(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con tapetes";
    }

    @Override
    public double costo() {
        return super.costo() + 92000.0;
    }
    
}
