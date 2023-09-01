package estruturasDecontrole;

import java.util.Scanner;

public class DoWhile {
/*
 * utilizando o doWhile o bloco de codigo ira repetir pelo menos uma vez!
 *Um rank de usabilidade: for > while >  doWhile
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Digite a senha! ");
		System.out.println(">>>");
		texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("123"));
		System.out.println("Acesso Liberado");
		
		entrada.close();
	}
}
