import java.util.Scanner;

public class practica2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroMes;

        do {
            System.out.print("Ingresa un número del 1 al 12: ");
            numeroMes = scanner.nextInt();

            if (numeroMes < 1 || numeroMes > 12) {
                System.out.println("Número inválido. Por favor, intenta de nuevo.");
            }
        } while (numeroMes < 1 || numeroMes > 12);


        String mes = "";

        switch (numeroMes) {
            case 1: mes = "Enero"; break;
            case 2: mes = "Febrero"; break;
            case 3: mes = "Marzo"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Mayo"; break;
            case 6: mes = "Junio"; break;
            case 7: mes = "Julio"; break;
            case 8: mes = "Agosto"; break;
            case 9: mes = "Septiembre"; break;
            case 10: mes = "Octubre"; break;
            case 11: mes = "Noviembre"; break;
            case 12: mes = "Diciembre"; break;
        }

        System.out.println("El mes correspondiente es: " + mes);
        scanner.close();
    }
}
