import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numero=JOptionPane.showInputDialog("Introduce el primer valor entero:");
		int num1=Integer.parseInt(numero);
		numero =JOptionPane.showInputDialog("Introduce el segundo valor entero:");
		int num2=Integer.parseInt(numero);
		String signo=JOptionPane.showInputDialog("Introduce un numero aritmetico");
		double result=0;
		switch (signo) {
		case "+":
			result=num1+num2;
			System.out.println(num1 + " + " + num2 + " = "+ result);
			break;
		case "-":
			result=num1-num2;
			System.out.println(num1 + " - " + num2 + " = "+ result);
			break;
		case "*":
		case "x":
			result=num1*num2;
			System.out.println(num1 + " x " + num2 + " = "+ result);
			break;
		case "/":
			result=num1/num2;
			System.out.println(num1 + " / " + num2 + " = "+ result);
			break;
		case "^":
			result=Math.pow(num1, num2);
			System.out.println(num1 + " ^ " + num2 + " = "+ result);
			break;
		case "%":
			result=num1%num2;
			System.out.println(num1 + " % " + num2 + " = "+ result);
			break;
		default:
			System.out.println("Te has equivocado al escrivir el signo");
			break;
		}
	}
}
