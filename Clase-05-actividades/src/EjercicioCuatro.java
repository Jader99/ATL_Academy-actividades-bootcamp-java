import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cuentaTotal, porcePropina, montoPropina;

        System.out.print("Ingrese el total de la cuenta: ");
        cuentaTotal = teclado.nextInt();

        System.out.print("Ingrese el porcentaje de propina que desea dejar ");
        porcePropina = teclado.nextInt();

        montoPropina = cuentaTotal * (porcePropina / 100);
        System.out.println("La propina para el mesero es: " + montoPropina);



    }
}
