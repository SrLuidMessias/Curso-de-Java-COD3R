package fundamentos;

import javax.swing.JOptionPane;

public class ProgramaFahrenheitToCelsius {
	public static void main(String []x) {
		String num1 = JOptionPane.showInputDialog("Digite um número em Fahrenheit ! : ");
		Double fa1 = Double.parseDouble(num1);
		double conversao = (fa1-32) * 5/9 ;
		System.out.println(conversao);
		
		
		
		
		
		
	}
}
