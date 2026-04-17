public class CubreBaul extends AccesoriosDecorator {
    public CubreBaul(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con Cubre Baúl";
    }

    @Override
    public double costo() {
        return super.costo() + 250000.0;
    }
    
}
