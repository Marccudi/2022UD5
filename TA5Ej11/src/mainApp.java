import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia=JOptionPane.showInputDialog("Escribe el dia de la semana:");
		switch (dia) {
		case "Lunes":
		case "lunes":
			System.out.println("Es un dia laboral");
			break;
		case "Martes":
		case "martes":
			System.out.println("Es un dia laboral");
			break;
		case "Miercoles":
		case "miercoles":
			System.out.println("Es un dia laboral");
			break;
		case "Jueves":
		case "jueves":
			System.out.println("Es un dia laboral");
			break;
		case "Viernes":
		case "viernes":
			System.out.println("Es un dia laboral");
			break;
		case "Sabado":
		case "sabado":
			System.out.println("Es un dia festivo");
			break;
		case "Domingo":
		case "domingo":
			System.out.println("Es un dia festivo");
			break;

		default:
			System.out.println("Te has equivocado al escribir el dia de la semana");
			break;
		}
	}

}
