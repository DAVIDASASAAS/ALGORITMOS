// Luna Sanabria 
import java.util.Scanner;
public class metodo_3 {

    // Método para sumar dos números
    public static int metodo_3(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int suma = metodo_3(num1, num2);

        System.out.println("La suma es: " + suma);
    }
}
