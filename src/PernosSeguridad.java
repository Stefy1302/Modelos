public class PernosSeguridad extends AccesoriosDecorator {
    public PernosSeguridad(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con Pernos de Seguridad";
    }

    @Override
    public double costo() {
        return super.costo() + 156100.0;
    }
    
}
