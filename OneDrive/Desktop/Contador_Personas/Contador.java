import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char respuesta = 'n', genero;
        int edad;
        int contniño = 0, contadolesente = 0, contadultojoven = 0, contAdulto = 0, contadultomayor = 0, contmujer = 0, conthombre = 0, contniña = 0, contadolesentemujer = 0, contadultajoven = 0, contAdulta = 0, contadultamayor = 0;

        while (respuesta != 's') {

            System.out.println("Ingrese su genero (H/M):");
            genero = sc.next().charAt(0);

            if (genero == 'h' || genero == 'H') {
                System.out.println("Ingrese su edad:");
                edad = sc.nextInt();

                conthombre += 1;

                if (edad >= 1 && edad <= 15) {
                    contniño += 1;
                } else if (edad >= 16 && edad <= 20) {
                    contadolesente += 1;
                } else if (edad >= 21 && edad <= 30) {
                    contadultojoven += 1;
                } else if (edad >= 31 && edad <= 60) {
                    contAdulto += 1;
                } else {
                    contadultomayor += 1;
                }
            } else if(genero == 'm' || genero == 'M'){
                System.out.println("Ingrese su edad:");
                edad = sc.nextInt();
                
                contmujer += 1;
                
                if (edad >= 1 && edad <= 15) {
                    contniña += 1;
                } else if (edad >= 16 && edad <= 20) {
                    contadolesentemujer += 1;
                } else if (edad >= 21 && edad <= 30) {
                    contadultajoven += 1;
                } else if (edad >= 31 && edad <= 60) {
                    contAdulta += 1;
                } else {
                    contadultamayor += 1;
                }
            }

            System.out.println("Para salir presione S");
            System.out.println("O presione cualquier tecla para continuar");
            respuesta = sc.next().charAt(0);
        }

        System.out.println("Hombres: " + conthombre + " Mujeres: " + contmujer + " Niños: " + contniño + " Niñas: " + contniña + " Adolescentes: " + contadolesente + " Adolescentes mujeres: " + contadolesentemujer + " Adultos jovenes: " + contadultojoven + " Adultas jovenes: " + contadultajoven + " Adulto: " + contAdulto + " Adulta: " + contAdulta + " Adultos mayores: " + contadultomayor + " Adultas mayores: " + contadultamayor);
        
    }
}
