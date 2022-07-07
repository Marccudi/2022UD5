import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass="contrasenya";
		String a="";
		int intentos=3;
		for (int i = 1; i <= intentos; i++) {
			a=JOptionPane.showInputDialog("introduce la contraseña (intento "+i+"/"+intentos+"):");
			if (a.equals(pass)) {
				System.out.println("Enhorabuena");
				i=4;
			}
			if (i==3) {
				System.out.println("Numero de intentos completados");
			}
		}
	}

}
