import java.util.Scanner;
/**
 * @author Santiago Graciano
 */

/*Programa que muestra si un número ingresado por teclado
  es par positiva, par negativo,impar positivo, impar negativo
  o si el numeto ingresado es 0 indicar que es un número neutro
*/
public class EsPar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Igrese un número");
        int numero = scanner.nextInt();
        
        if(numero != 0){
            if(numero > 0){
                if(numero % 2 == 0){
                System.out.printf("El numero %d es par positivo \n",numero);
                }else{
                    System.out.printf("El numero %d es impar positivo \n",numero);
                }
            }else{
                if(numero % 2 == 0){
                System.out.printf("El numero %d es par negativo \n",numero);
                }else{
                    System.out.printf("El numero %d es impar negativo \n",numero);
                }
            }
        }else{
            System.out.printf("El numero %d es neutro \n",numero);
        }
        
    }
    
}
