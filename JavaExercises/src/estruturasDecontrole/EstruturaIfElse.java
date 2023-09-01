package estruturasDecontrole;

import javax.swing.JOptionPane;

public class EstruturaIfElse {

	public static void main(String[] x) {
		String valor = JOptionPane.showInputDialog(
				"Informe o número: ");
		int numero = Integer.parseInt(valor);
		if (numero %2 == 0) {
			System.out.println("numero par");
		}
		if (numero % 2 == 1) {
			System.out.println("numero impar");
		}
		//ou podes fazer assim >>>
		if (numero % 2 == 0) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
		
	}
}
