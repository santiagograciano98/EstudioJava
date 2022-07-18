public class Suma {

    public int suma(int... numeros) {
        int suma = 0;

        for (int num : numeros) {
            suma += num;
        }

        return suma;
    }
}
