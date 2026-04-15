public class Main {
    public static void main(String[] args) {
        Vehiculo picantoBase = new PicantoBase();

        Vehiculo vibrantMT = new VibrantMT();
        vibrantMT = new Alarmas(vibrantMT);

        Vehiculo zenithMT = new ZenithMT();
        zenithMT = new CubreBaul(zenithMT);
        zenithMT = new KitAlarma(zenithMT);

        Vehiculo zenithAT = new ZenithAT();
        zenithAT = new KitAmpliacionLateral(zenithAT);
        zenithAT = new MallaCarga(zenithAT);
        zenithAT = new PernosSeguridad(zenithAT);

        Vehiculo gtLineAT = new GTLineAT();
        gtLineAT = new PortaBicis(gtLineAT);
        gtLineAT = new RIn(gtLineAT);
        gtLineAT = new SensorParqueo(gtLineAT);
        gtLineAT = new Tapetes(gtLineAT);
        gtLineAT = new TiroArrastre(gtLineAT);

        // pruebas
        System.err.println("Pueba 1: Base sin accesorios");
        System.out.println(picantoBase.getDescripcion() + " - Costo: $" + picantoBase.costo());

        System.err.println("\nPueba 2: Vibrant MT con alarma");
        System.out.println(vibrantMT.getDescripcion() + " - Costo: $" + vibrantMT.costo());

        System.err.println("\nPueba 3: Zenith MT con cubre baúl y kit alarma");
        System.out.println(zenithMT.getDescripcion() + " - Costo: $" + zenithMT.costo());

        System.err.println("\nPueba 4: Zenith AT con kit ampliación lateral, malla de carga y pernos de seguridad");
        System.out.println(zenithAT.getDescripcion() + " - Costo: $" + zenithAT.costo());

        System.err.println("\nPueba 5: GT Line AT con porta bicis, rines de aleación, sensor de parqueo, tapetes y tiro de arrastre");
        System.out.println(gtLineAT.getDescripcion() + " - Costo: $" + gtLineAT.costo());
    }
}
