package estruturasDecontrole;

import java.util.Scanner;

public class IfElseIF {
//Objetivo - mostrar como funciona o else if!
	public static void main(String[]x) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite  a nota do aluno: ");
		double nota = entrada.nextDouble();
/*
 * Não poderia começar com else if, só com if! Else tem que estar
 *associado ao if!
*/
		if(nota > 10 || nota < 0 ) {
			System.out.println("Nota INVALIDA");
		} else if (nota >= 8.1) {
			System.out.println("Conceto A");
		} else if (nota >= 6.1) {
			System.out.println("Conceito B");
		} else if (nota >4.1) {
			System.out.println("Conceito C");
		} else if (nota > 2.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}
//codigo de forma diferente:
		
//		if (nota > 10 || nota <0) {
//			System.out.println("Nota inválida");
//		} else {
//			if(nota >= 8.1) {
//				System.out.println("Conceito a");				
//			} else {
//				if(nota >= 6.1) {
//					System.out.println("Conceito b");
//				}else {
//					if(nota >= 4.1) {
//						System.out.println("Conceito c");
//					}else {
//						if(nota >= 2.1) {
//							System.out.println("Conceito d");
//
//						} else {
//							System.out.println("Conceito e");
//						}
//					}
//				}
//			}
//		}



		
		
		
		
		entrada.close();
	}
}
