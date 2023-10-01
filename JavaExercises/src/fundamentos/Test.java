package fundamentos;

import java.util.Scanner;

public class Test{
	public static void main(String []x) {
		String[] nomes = new String [3];
		Scanner entrada = new Scanner(System.in);
		
		for (int c = 1; c <= 3; c++) {
			System.out.printf("Digite o %d° nome >>>", c);
			String nome = entrada.nextLine();
			System.out.println("Nome adicionado!");
			nomes [c-1]= nome;
			if (c == 3) {
				System.out.println(nomes[c]);
				break;
			}
		}
		
		
		
		entrada.close();
		
		
	}
}