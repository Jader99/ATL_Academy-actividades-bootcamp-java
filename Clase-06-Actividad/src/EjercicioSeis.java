import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite el primer número: ");
        int numeroUno = teclado.nextInt();
        System.out.print("Digite el segundo número: ");
        int numeroDos = teclado.nextInt();
        System.out.print("Digite el tecer número: ");
        int numeroTres = teclado.nextInt();
        
        //Para numero mayor
        if(numeroUno > numeroDos && numeroUno > numeroTres){
            System.out.println("El número mayor es: "+ numeroUno);
        } else if(numeroDos > numeroUno && numeroDos > numeroTres){
            System.out.println("El número mayor es: "+ numeroDos);
        } else {
            System.out.println("El número mayor es: "+ numeroTres);
        }

        //Para numero menor
        if(numeroUno < numeroDos && numeroUno < numeroTres){
            System.out.println("El número menor es: "+ numeroUno);
        } else if(numeroDos < numeroUno && numeroDos < numeroTres){
            System.out.println("El número menor es: "+ numeroDos);
        } else {
            System.out.println("El número menor es: "+ numeroTres);
        }
    }
}
