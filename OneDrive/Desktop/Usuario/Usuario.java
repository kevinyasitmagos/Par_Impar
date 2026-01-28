import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuariop = "Yasit";
        String contrap = "101010";

        boolean acceso = false;

        System.out.println("Ingresa el usuario");
        String usuario = sc.nextLine();

        System.out.println("Ingresa la contraseña");
        String contra = sc.nextLine();

        if (usuario.equals(usuariop) && contra.equals(contrap)) {
            acceso = true;
        }

        if (acceso == true) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
