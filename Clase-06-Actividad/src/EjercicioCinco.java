import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese 3 números para hayar su promedio: ");

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        int promedio = (num1 + num2 +num3)/3;
        System.out.print("El promedio es: " + promedio);
    }
}
