public class Ejercicio6 {

    public static void main(String[] args) {
        int teclado = 100;
        int celular = 350;
        int computadora = 550;
        int total = (celular + teclado + computadora);
        double iva = (total * 0.22);
        double totalFinal = (total + iva);
        System.out.println("El iva  de sus 3 productos = "+ iva);
        System.out.println("El total final de sus 3 productos = "+ totalFinal);

    }
}