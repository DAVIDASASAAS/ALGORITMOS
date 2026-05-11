//AQUI VAMOS A GENREAR TODOS LOS MODULOS CORRESPODIENTES
import java.util.Scanner;
public class modulos {
//ASIGNACIONES
    //DAVID:
    //VALENTINA:
    //3.Método para sumar dos números (Luna Sanabria)
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
    //MIGUEL:
    
