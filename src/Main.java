import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History gestor = new History();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE ESTADOS (MEMENTO) ---");
            System.out.println("Texto actual: " + (editor.getContenido() == null ? "[Vacío]" : editor.getContenido()));
            System.out.println("1. Modificar texto");
            System.out.println("2. Guardar versión (Checkpoint)");
            System.out.println("3. Ver historial y restaurar");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Escriba el nuevo contenido: ");
                    editor.setContenido(sc.nextLine());
                }
                case 2 -> {
                    gestor.añadirMemento(editor.guardar());
                    System.out.println("¡Versión guardada correctamente!");
                }
                case 3 -> {
                    if (gestor.getCantidadEstados() == 0) {
                        System.out.println("No hay versiones guardadas.");
                    } else {
                        System.out.println("Versiones disponibles:");
                        for (int i = 0; i < gestor.getCantidadEstados(); i++) {
                            System.out.println(i + ": " + gestor.getMemento(i).getEstadoGuardado());
                        }
                        System.out.print("Seleccione el índice a restaurar: ");
                        int indice = sc.nextInt();
                        editor.restaurar(gestor.getMemento(indice));
                        System.out.println("Estado restaurado.");
                    }
                }
                case 4 -> System.out.println("Finalizando programa.");
            }
        } while (opcion != 4);
        
        sc.close();
    }
}