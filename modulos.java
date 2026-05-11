import java.util.Scanner;

public class Main {

    // Método que saluda al usuario
    public static void saludar() {
        System.out.println("Hola, bienvenido al programa.");
    }

    // Método que pide dos números enteros
    public static int[] pedirNumeros() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        return new int[]{a, b};
    }

    // Método que suma dos números positivos
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método principal
    public static void main(String[] args) {

        // Llamar al método saludo
        saludar();

        // Pedir números
        int[] numeros = pedirNumeros();

        // Guardar números
        int a = numeros[0];
        int b = numeros[1];

        // Sumar números
        int resultado = sumar(a, b);

        // Mostrar resultado
        System.out.println("La suma es: " + resultado);
    }
}
