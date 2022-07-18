
public class Funciones {
    public static void main(String[] args) {
        //sumar(10, 20);
        cuentaRegresive(10);
        
    }
    
    static void saludar(){
        System.out.println("Hola mundo");
    }
    
    static void sumar(int a, int b) {
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }
    
    //ejemplo funcion recursiva
    static void cuentaRegresive(int numero){
        numero --;
        if(numero > 0){
            System.out.println(numero);
            cuentaRegresive(numero);
        }else{
            System.out.println("ya llego a cero");
        }
    }
}
