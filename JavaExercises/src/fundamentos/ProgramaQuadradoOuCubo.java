package fundamentos;

import javax.swing.JOptionPane;

public class ProgramaQuadradoOuCubo {
	public static void main(String[]x) {
		String valor = JOptionPane.showInputDialog("Digite uma valor! :");
		double valorconversion = Double.parseDouble(valor);
		double cubo = Math.pow(valorconversion, 3);
		double quadrado = Math.pow(valorconversion, 2);
		System.out.printf("Cubo = %s", cubo);
		System.out.printf("\nquadrado = %s", quadrado);
		
		
		
		
	}
}
