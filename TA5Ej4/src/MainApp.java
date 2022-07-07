import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Introduce el radio del circulo:");
		Double radio = Double.parseDouble(numero);
		Double result = Math.PI * Math.pow(radio, 2);
		System.out.println("El area del circulo con un radio de " + radio + " es de: " + result);

	}

}
