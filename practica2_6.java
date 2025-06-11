
    import java.util.Scanner;

    public class practica2_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa el primer número: ");
            int a = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int b = scanner.nextInt();

            int resultado = 0;
            int positivoB = Math.abs(b);

            for (int i = 0; i < positivoB; i++) {
                resultado += a;
            }

            if (b < 0) {
                resultado = -resultado;
            }

            System.out.println("Resultado: " + resultado);
            scanner.close();
        }
    }


