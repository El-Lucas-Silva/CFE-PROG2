import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre.");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad.");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese su ciudad.");
        String ciudad = leer.nextLine();
        System.out.println("Bienvenido, "+ nombre + " de "+ edad +" años que vive en "+ ciudad +"!");
    }
}