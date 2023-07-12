package fundamentos;

import java.util.Scanner;

public class DesafioConversão {
	
	public static void main(String []args) {
		System.out.println("vamos digitar os ultimos 3 salarios");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu salario");
		String S1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite seu salario");
		String S2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite seu salario");
		String S3 = entrada.nextLine().replace(",", ".");
		
		double V1 = Double.parseDouble(S1);
		double V2 = Double.parseDouble(S2);
		double V3 = Double.parseDouble(S3);
		double soma = V1 + V2 + V3;
		System.out.printf("Sua media salarial e R$%.2f " , soma/3);
		entrada.close();
	}
}
