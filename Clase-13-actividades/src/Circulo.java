import javax.swing.*;

public class Circulo extends Figura{
    private double radio;

    public double getRadio() {

        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }


    public double calcularPerimetro() {
        double perimetro = 2 * (Math.PI * radio);
        return perimetro;
    }

    public double calcularArea(){
        double area = Math.PI*(Math.pow(radio, 2));
        return area;
    }

    public void cargarDatos() {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo en cm"));
    }

}
