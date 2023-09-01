package estruturasDecontrole;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota = 0 ;
		double total = 0;
		int vezes = 0;
		
		while ( nota != -1 ) {	
			System.out.println("Digite a nota do aluno (ou -1 para sair) :");
			nota = entrada.nextDouble();
//
			if (nota <= 10 && nota >=0) {
			vezes ++;
			total += nota;
			} else if (nota != -1) {
				System.out.println("Nota Inválida");
			}
			}
	//média
			System.out.println("Soma total da notas é " + total);
		double media = total  / vezes ;
		System.out.println("A média é igual a " + media);
		entrada.close();
		}
}
