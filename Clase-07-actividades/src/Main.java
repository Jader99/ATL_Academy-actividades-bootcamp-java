import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número (faltan ingresar " + (numeros.length - i) + " numeros)");
            int numero = teclado.nextInt();
            numeros[i] = numero;
        }

        int mayor = 0;
        int menor = 0;
        int suma = 0;

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor || i == 0){
                menor = numeros[i];
            }
            System.out.println(numeros[i]);
        }
        float promedio = (float) suma / numeros.length;
        System.out.println("El número mayor es " + mayor + ", el número menor es " + menor +" y el promedio es " + promedio );


    }

}