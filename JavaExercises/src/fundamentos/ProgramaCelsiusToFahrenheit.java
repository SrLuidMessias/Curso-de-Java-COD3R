package fundamentos;

import javax.swing.JOptionPane;

public class ProgramaCelsiusToFahrenheit {
	public static void main(String[]x) {
		String celsius = JOptionPane.showInputDialog("Digite um número em Celsius! :");
		int num = Integer.parseInt(celsius);
		int fahren = (num * 9/5) + 32;
		System.out.println(fahren);
		
		
		
		
		
		
		
		
	}
}
