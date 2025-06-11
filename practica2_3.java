import java.util.Scanner;

public class practica2_3 {
     public static void main(String[] args) {
         Scanner tc=new Scanner(System.in);
         System.out.println("digite un numero entero");
         int a=tc.nextInt();
         System.out.println("digite un numero entero");
         int b=tc.nextInt();
         System.out.println("digite un numero entero");
         int c=tc.nextInt();

         int men=Math.min(a, Math.min(b, c));


         System.out.println("El numero menor es:"+" "+men);
    }
}
