import java.util.Scanner;

public class practica2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el dividendo : ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingresa el divisor : ");
        int divisor = scanner.nextInt();


        if (divisor == 0) {
            System.out.println("No se puede dividir entre cero.");
            return;
        }

        int cociente = 0;
        int residuo = dividendo;


        while (residuo >= divisor) {
            residuo = residuo - divisor;
            cociente++;
        }

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

        scanner.close();
    }
}
