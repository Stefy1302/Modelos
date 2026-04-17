public class MallaCarga extends AccesoriosDecorator {
    public MallaCarga(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con Malla de Carga";
    }

    @Override
    public double costo() {
        return super.costo() + 110000.0;
    }
    
}
