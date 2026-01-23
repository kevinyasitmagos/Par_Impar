import java.util.Scanner;

public class Servicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Ingresa M (Mujer) o H (Hombre)");
        char letra = sc.next().charAt(0);
        System.out.println("Ingresa tu edad");
         edad = sc.nextInt();
       
        if ((letra == 'H') && (edad >= 18)) {
            System.out.println("Realiza servicio militar");
       
        } else  {
             System.out.println("No hace servicio militar");
        }
    }
}
