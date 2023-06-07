import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double millas, kilometros;

        System.out.print("Ingrese una distancia en millas: ");
        millas = teclado.nextDouble();

        kilometros = millas * 1.60934;

        System.out.print("La distancia en Kilimoetros es: " + kilometros);

    }
}
