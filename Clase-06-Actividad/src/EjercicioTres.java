import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero de telefono:");

        String telefono = teclado.nextLine();
        System.out.println("https://api.whatsapp.com/send?phone= " + telefono);
    }
}
