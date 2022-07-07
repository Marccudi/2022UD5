import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero=JOptionPane.showInputDialog("Numero de ventas a introducir:");
		int numeroVentas=Integer.parseInt(numero);
		double result = 0;
		double venta = 0;
		for (int i = 1; i <= numeroVentas; i++) {
			String a = JOptionPane.showInputDialog("Precio de la venta numero " + i);
			venta += Double.parseDouble(a);
		}
		double precioFinal=venta+(venta*0.21);
		System.out.println("El total de las ventas es de: " + precioFinal);
	}

}
