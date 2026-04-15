public class KitAlarma extends AccesoriosDecorator {
    public KitAlarma(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Kit de Alarma";
    }

    @Override
    public double costo() {
        return super.costo() + 1500000.0;
    }
    
}
