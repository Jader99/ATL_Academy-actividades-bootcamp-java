import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un pais a buscar:");

        String pais = teclado.nextLine();

        System.out.println("https://www.google.com/maps/search/"+pais);

    }
}
