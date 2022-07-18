import java.util.Scanner;

/**
 * @author Santiago Graciano
 */
/*
    programa que permite el ingreso de una letra
    y detecta si es vocal
*/
public class EsVocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        
        String letra = scanner.nextLine();
        
        if(letra.equals("a") || letra.equals("A")){
            System.out.printf("La letra %s es vocal",letra);
        }else if(letra.equals("e") || letra.equals("E")){
            System.out.printf("La letra %s es vocal",letra);
        }else if(letra.equals("i") || letra.equals("I")){
            System.out.printf("La letra %s es vocal",letra);
        }else if(letra.equals("o") || letra.equals("O")){
            System.out.printf("La letra %s es vocal",letra);
        }else if(letra.equals("u") || letra.equals("U")){
            System.out.printf("La letra %s es vocal",letra);
        }else{
            System.out.printf("La letra %s no es vocal",letra);
        }
        
        
    }
    
}
