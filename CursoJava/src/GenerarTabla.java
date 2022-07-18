import java.util.Scanner;
/**
 * @author Santiago Graciano
 */
/**
 * Programa para generar una tabla de multiplicacion
 */
public class GenerarTabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int numero = scanner.nextInt();
        int contador = 0;
        
        while(contador <= 10){
            System.out.println(numero + "*" + contador +" = " + numero * contador);
            contador ++;
        }
        System.out.println("-------------------------------------");
        //tambien se puede hacer con for
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n",numero,i,(numero * i));
        }
        
    }
    
}
