
import funcionesEspeciales.OperacionesMatematicas;
import static funcionesEspeciales.OperacionesMatematicas.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    int x, y;
    public static final String PATRON_FECHA_HORA = "dd/MM/yyyy HH:mm:ss";
    public static final String PATRON_FECHA = "dd/MM/yyyy";
    public static String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern(PATRON_FECHA_HORA));
    public static String fecha2 = LocalDate.now().format(DateTimeFormatter.ofPattern(PATRON_FECHA));

    public Main() {
        x = 5;
        y = 20;

    }

    public Main(int p1, int p2) {
        x = p1;
        y = p2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DetalleArticulosLn detArt = new DetalleArticulosLn();
        System.out.print("ingrese el codigo del artículo: ");
        detArt.setArticuloCodigo(scanner.nextLine());
        System.out.println("");
        System.out.print("ingrese el codigo del componente: ");
        detArt.setComponenteCodigo(scanner.nextLine());
        System.out.println("");
        try {
            System.out.print("ingrese la cantidad: ");
            detArt.setCantidad(scanner.nextFloat());
        } catch (Exception e) {
            System.out.println("Error en datos");
        }

        System.out.println(detArt.getArticuloCodigo());
        System.out.println(detArt.getComponenteCodigo());
        System.out.println(detArt.getCantidad());

        /* System.out.println(fecha);
        System.out.println(fecha2);
        
        Main myObj = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        System.out.println(myObj.x * myObj.y);

        Main myObj2 = new Main(10, 35);
        System.out.println(myObj2.x);
        System.out.println(myObj2.y);
        System.out.println(myObj2.x * myObj.y);

        Suma prueba = new Suma();

        System.out.println("la suma es: " + prueba.suma(4, 5, 2));
        int a = 10;
        int b = 20;
        int resultado = suma(a,b);
        System.out.println("suma de: " + a + "+" + b + " es " + resultado);
        
        resultado = resta(a,b);
        System.out.println("resta de: " + a + "-" + b + " es " + resultado);
        
        a = 15;
        b = 4;
        resultado = suma(a,b);
        System.out.println("suma de: " + a + "+" + b + " es " + resultado);
        
        resultado = resta(a,b);
        System.out.println("resta de: " + a + "-" + b + " es " + resultado);
        
        OperacionesMatematicas operacionesMat = new OperacionesMatematicas();
        
        int resultadoSuma = operacionesMat.suma1(3,4,5);
        System.out.println(resultadoSuma);*/
    }

}
