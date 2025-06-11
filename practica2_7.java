import java.util.*;

public class practica2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HashMap<String, Integer> votos = new HashMap<>();
        votos.put("Rapidos y Furiosos", 0);
        votos.put("Stich", 0);
        votos.put(" Mentiroso Mentiroso", 0);

        List<String> claves = new ArrayList<>(votos.keySet());


        for (int i = 1; i <= 10; i++) {
            System.out.println("Persona " + i + ", elige una opción:");
            for (int j = 0; j < claves.size(); j++) {
                System.out.println((j + 1) + ": " + claves.get(j));
            }

            int seleccion;
            do {
                System.out.print("Tu voto (1-3): ");
                seleccion = scanner.nextInt();
            } while (seleccion < 1 || seleccion > 3);

            String opcionSeleccionada = claves.get(seleccion - 1);
            votos.put(opcionSeleccionada, votos.get(opcionSeleccionada) + 1);
        }

        System.out.println("\nDistribución de votos - Valores globales");
        System.out.println("Datos\t\tEscala\t\tAbsoluto\tPorcentual");

        int totalVotos = 10;

        for (String opcion : claves) {
            int cantidad = votos.get(opcion);
            String estrellas = "* ".repeat(cantidad).trim();
            double porcentaje = (cantidad / (double) totalVotos) * 100;

            System.out.printf("%-10s\t%s\t\t%d\t\t%.0f%%\n", opcion, estrellas, cantidad, porcentaje);
        }

        System.out.printf("%-10s\t\t\t%d\t\t%d%%\n", "Totales", totalVotos, 100);
        scanner.close();
    }
}
