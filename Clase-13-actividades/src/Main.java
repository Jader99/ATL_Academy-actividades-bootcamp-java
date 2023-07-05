import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean mostrarMenu = true;

        while (mostrarMenu) {
            mostrarMenu = crearFigura();
        }
    }
        private static boolean crearFigura() {

            int opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU"+"\n"+"Elija la figura a la que le quiere calcular el Área"
                    +"\n"+"1) Círculo"+"\n"+"2) Triángulo"+"\n"+"3) Rectángulo"+"\n"+"0) Salir"));

            switch (opcion){

                case 1:
                    Circulo circulo = new Circulo();
                    circulo.cargarDatos();
                    JOptionPane.showMessageDialog(null,"El área del círculo es: " + circulo.calcularArea() + " cm");
                    JOptionPane.showMessageDialog(null,"El perímetro del círculo es: " + circulo.calcularPerimetro() +" cm");
                    break;

                case 2:
                    Triangulo triangulo = new Triangulo();
                    triangulo.cargarDatos();
                    JOptionPane.showMessageDialog(null,"El área del triángulo es: " + triangulo.calcularArea()+" cm");
                    JOptionPane.showMessageDialog(null,"El perímetro del triángulo es: " + triangulo.calcularPerimetro()+" cm");
                    break;

                case 3:
                    Rectangulo rectangulo = new Rectangulo();
                    rectangulo.cargarDatos();
                    JOptionPane.showMessageDialog(null,"El área del rectángulo es: " + rectangulo.calcularArea()+" cm");
                    JOptionPane.showMessageDialog(null,"El perímetro del rectángulo es: " + rectangulo.calcularPerimetro()+" cm");
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null,"Saliendo del programa...");
                    return false;

                default:
                    JOptionPane.showInternalMessageDialog(null,"Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
            return true;

        }

    }
