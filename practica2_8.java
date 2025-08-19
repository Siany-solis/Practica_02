import java.util.HashMap;
import java.util.Scanner;

public class practica2_8 {
    public static void main (String[] args) {


        HashMap<String, Integer> alternativas = new HashMap<>();
        alternativas.put("futbol", 0);
        alternativas.put("tennis", 0);
        alternativas.put("basketball", 0);
        Scanner tc= new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("selecciona tu preferida persona "+i );
            System.out.println("Opciones validas (FUTBOL,TENNIS,BASKETBALL)");
               String vot= tc.next();
            if (vot.equalsIgnoreCase("futbol")) {
                alternativas.put("futbol", alternativas.get("futbol") + 1);
            } else if (vot.equalsIgnoreCase("tennis")) {
                alternativas.put("tennis", alternativas.get("tennis") + 1);
            } else if (vot.equalsIgnoreCase("basketball")) {
                alternativas.put("basketball", alternativas.get("basketball") + 1);
            } else {
                System.out.println("Opción inválida, intenta de nuevo.");
                i--;
            }


            System.out.printf("");

        }













    }
}
