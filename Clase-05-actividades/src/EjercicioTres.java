import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int precioOriginal, porcenDescuento, precioFinal;

        System.out.print("Ingrese el precio del producto: ");
        precioOriginal = teclado.nextInt();

        System.out.print("Ingrese el porcentaje de descuento: ");
        porcenDescuento = teclado.nextInt();

        precioFinal = precioOriginal - (precioOriginal * porcenDescuento / 100);
        System.out.print("El precio final es: " + precioFinal);
    }
}
