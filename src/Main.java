import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicitar los datos de entrada
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de A"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de B"));

        // Crear el objeto comparador con los datos recogidos
        Comparador comparador = new Comparador(a, b);

        // Comparar los valores y mostrar el resultado
        String resultado = comparador.comparar();
        JOptionPane.showMessageDialog(null, resultado);
    }
}
