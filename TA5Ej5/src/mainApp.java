import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero=JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(numero);
		
		if (num%2==0) {
			System.out.println("El numero " + num + " es divisible entre 2");
		} else {
			System.out.println("El numero " + num + " no es divisible entre 2");
		}
	}

}
