package fundamentos;

import javax.swing.JOptionPane;

public class DesafioIMC {

	public static void main(String[] x) {
		String  num1 = JOptionPane.showInputDialog("Digite seu peso! :");
		String num2 = JOptionPane.showInputDialog("Digite sua altura :");
		double peso = Double.parseDouble(num1);
		double altura = Double.parseDouble(num2);
		System.out.printf("Peso = %.2f", peso);
		System.out.printf("\nAltura = %.2f", altura );

		double cal = Math.pow(altura, 2);
		double imc = (peso)/ (cal);
		System.out.printf("\nIMC = %.2f",imc);
		
		
		
		
		
	}
}
