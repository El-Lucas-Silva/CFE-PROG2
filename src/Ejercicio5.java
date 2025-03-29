import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un temperatura en grados Celsius.");
        double celsius = leer.nextDouble();
        System.out.println("La tempreratura de "+ celsius +" grados Celsius en Fahrenheits es: "+ ((celsius * 1.8) + 32));

    }
}
