import java.sql.SQLOutput;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

public class practica2_1 {
   public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       System.out.println("Digite el numero A");
       int a=teclado.nextInt();
       System.out.println("Digite el siguiente numero B");
       int b= teclado.nextInt();
       if(a%b==0){
           System.out.println("El numero "+a+"si es divisible entre"+b);

       }else {
           System.out.println("El numero "+a+"no es divisible entre"+b);
       }
    }
}
