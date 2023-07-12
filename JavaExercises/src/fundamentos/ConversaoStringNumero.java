package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero{
	public static void main(String []args) {
/*showInputDialog – Exibe uma caixa solicitando 
 * a entrada de dados pelo usuário em um campo 
 * de texto, e botões OK e Cancel. Ao clicar em OK,
 *  o texto digitado pelo usuário é retornado pelo 
 *  método, e pode ser armazenado em uma variável, por exemplo.
 */
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero");

		System.out.println(valor1 + valor2);
//Nesse caso .parse converte String para double,
//mas é possivel utilizar outros tipos também
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("soma : " + soma);
		System.out.println("media : " + soma/2);
		
		
	}
}



