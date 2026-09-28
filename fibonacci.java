public class FibonacciRecursivo {

    // Método recursivo para obtener el valor en la posición n
    public static int fibonacci(int n) {
        // Caso base: si n es 0 o 1, devuelve n
        if (n <= 1) {
            return n;
        }
        // Caso recursivo: suma los dos anteriores
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int cantidadTerminos = 10; // Cantidad de números a mostrar

        System.out.println("Serie de Fibonacci de " + cantidadTerminos + " términos:");
        for (int i = 0; i < cantidadTerminos; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
