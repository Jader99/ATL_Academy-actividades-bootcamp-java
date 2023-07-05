import javax.swing.*;

public class Triangulo extends PoligonoRegular{
    protected double lado1;
    protected double lado2;
    protected double lado3;

    @Override
    public double calcularPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = (base * altura)/2;
        return area;
    }

    public void cargarDatos() {
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo en cm"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo en cm "));
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del primer lado del triangulo en cm"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del segundo lado del triangulo en cm"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del tercer lado del triangulo en cm"));
    }
}
