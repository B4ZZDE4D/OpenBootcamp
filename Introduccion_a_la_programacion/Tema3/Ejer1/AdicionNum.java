public class AdicionNum {
    public static void main(String[] args) {
        int resultado = sum(3, 4, 2);
        System.out.println("La suma de los valores es " + resultado);
    }

    // |Funcion de suma|
    public static int sum(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }
}