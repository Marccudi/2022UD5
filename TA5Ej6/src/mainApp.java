import javax.swing.JOptionPane;

public class mainApp {
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce el precio del producto:");
		double num= Double.parseDouble(numero);
		final double iva = 0.21;
		double result = num+(num*iva);
		System.out.println("El precio total con iva incluido es de: " + result);
	}
}
