public class SensorParqueo extends AccesoriosDecorator {
    public SensorParqueo(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Sensor de Parqueo";
    }

    @Override
    public double costo() {
        return super.costo() + 150000.0;
    }
    
}
