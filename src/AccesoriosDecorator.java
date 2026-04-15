abstract class AccesoriosDecorator implements Vehiculo {
    protected Vehiculo vehiculo;

    public AccesoriosDecorator(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion();
    }

    @Override
    public double costo() {
        return vehiculo.costo();
    }
}   