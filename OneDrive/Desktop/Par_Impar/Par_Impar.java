import java.util.Scanner;
 
 public class Par_Impar{
     public static void main (String [] args){
         
         Scanner sc = new Scanner(System.in);
         int numero;

         System.out.println("Ingresa un numero entero");
         numero = sc.nextInt();

         if (numero % 2 == 0) {
            System.out.println("El numero es par");
         }      
        else if (numero % 2 == 1) {
         System.out.println("El numero es impar");
        }
      }
        } 
    