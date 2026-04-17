public class KitAmpliacionLateral extends AccesoriosDecorator {
    public KitAmpliacionLateral(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Kit de Ampliación Lateral";
    }

    @Override
    public double costo() {
        return super.costo() + 1500000.0;
    }
    
}
