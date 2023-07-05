import javax.swing.*;

public class Rectangulo extends PoligonoRegular  {

    @Override
    public double calcularPerimetro() {
        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }

    public void cargarDatos() {
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo en cm"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo en cm"));
    }
}
