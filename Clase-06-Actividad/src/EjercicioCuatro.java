import java.rmi.StubNotFoundException;
import java.util.Scanner;

/*  Elige tu propia Aventura”.

 Es una noche estrellada, te encuentras en un bosque misterioso: 
 1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante
 2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora

 El usuario escoge “2”:
 Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. 
 Al llegar a la cabaña, te das cuenta de que hay dos puertas: 
 1) Entras por la puerta de la izquierda 
 2) Optas por la puerta de la derecha

 El usuario escoge “1”:
 Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. 
 Te maravillas con las joyas y los objetos preciosos que llenan la sala. 
 Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. 
 Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. 
 ¡Felicidades, has tenido un final exitoso en tu búsqueda!
*/


public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso:");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
        
        int opcion = teclado.nextInt();        
    
        if(opcion == 2){
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas:");
        } else {
            System.out.println("No elejiste nada. Fin de la historia 😒");
        }

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("1) Entras por la puerta de la izquierda / 2) Optas por la puerta de la derecha");
        opcion = teclado.nextInt();
        if(opcion == 1){
            System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!");
        } else {
            System.out.println("En la otra puerta no hay nada.");
        }
        
    }
}
