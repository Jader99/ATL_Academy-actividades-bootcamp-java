import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int jugada = 0;   
        int pc = 0;
        int triunfos = 0;
        int perdidas = 0;
        
        while(triunfos < 3 && perdidas < 3){

        System.out.print("Elige: 1 para piedra, 2 para papel, 3 para tijera: ");
        jugada = teclado.nextInt();
        System.out.println("-----------------------------------------");
        if(jugada == 1){
            System.out.println("Elegiste piedra");
        } else if (jugada == 2){
            System.out.println("Elegiste papel");
        } else if (jugada == 3) {
            System.out.println("Elegiste tijera");
        } else {
            System.out.println("no elejiste nada");
        }


        System.out.println("------------------------------------------");
        pc = (int) Math.floor(Math.random()*3;
        if(pc == 1){
            System.out.println("PC Elige piedra");
        } else if (pc == 2){
            System.out.println("PC Elige papel");
        } else if (pc == 3) {
            System.out.println("PC Elige tijera");
        } else {
            System.out.println("");
        }
        
        System.out.println("---------------------------------------------");

        if(jugada == pc){
            System.out.println("EMPATE");

        } else if ((jugada == 1 && pc == 3) || (jugada == 2 && pc == 1) || (jugada == 3 && pc == 2)){
            System.out.println("GANASTE");
            triunfos += 1;
        } else{
            System.out.println("Pediste");
            perdidas += 1;
        }
    }
        System.out.println("Ganaste " + triunfos + " veces. Perdiste " + perdidas + " veces");

    }
}
