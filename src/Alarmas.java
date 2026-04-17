public class Alarmas extends AccesoriosDecorator {
    public Alarmas(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Sistema de Alarmas";
    }

    @Override
    public double costo() {
        return super.costo() + 205000.0;
    }
    
}
