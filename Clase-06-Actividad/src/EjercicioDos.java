import java.util.Scanner;

public class EjercicioDos{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre de una celebridad: ");
        String celebridad = teclado.nextLine();

        System.out.println("https://www.google.com/maps/search/" + celebridad);
        
    }
}