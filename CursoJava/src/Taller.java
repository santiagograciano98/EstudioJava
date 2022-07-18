
public class Taller {
    
    public static void main(String[] args) {
        punto15();
        
    }
    
    public static void punto14(int numero){
        numero --;
        if(numero >= 0){
            System.out.println("Llamar métodos es un concepto poderoso");
            punto14(numero);
        }
    }
    
    
    public static void punto15 () {
        String nombre = "Perro";
        int numeroPatas = 8;
        String caracteristica = "Ladrar";
        
        System.out.println("Animal: " + nombre);
        validarPatas(numeroPatas);
        System.out.println("Caracteristica unica: " + caracteristica);
    }
    
    public static void validarPatas(int numeroPatas) {
        if((numeroPatas >= 0 && numeroPatas <= 1000) && numeroPatas % 2 == 0){
            System.out.println("Numero de patas correcto");
        }else{
            System.out.println("Numero patas incorrecto");
        }
    }
    
    
    
    
    
    public static void punto17(){
        int N = 10;
        double A = 50.5;
        char C = 'a';
        
        System.out.println(N);
        System.out.println(A);
        System.out.println(C);
        
        
        System.out.println(N + A);
        System.out.println(A - N);
        System.out.println((int)C);
        
    }
    
}
