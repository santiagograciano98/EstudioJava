import java.util.Scanner;
/**
 * @author Santiago Graciano
 * 
 * Programa el cual permite el ingreso de un número,
 * si es 1 debe imprimir lunes y asi hasta el 7 que debe imprimir
 * domingo, de lo contrario, dia no existe
 */
public class DiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero (1 -7)");
        
        int dia = scanner.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("El numero que ingreso no corresponde a un dia de la semana");
        }
    }
}
