package estruturasDecontrole;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[]x) {
		//Domingo - 1
		//Segunda - 2
		//Terça - 3
		//Quarta - 4
		//Quinta - 5
		//Sexta - 6
		//Sábado - 7
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Digite o dia da semana: ");
		String semana = entrada.nextLine();
		//.equalsIgnoreCase(semana), vai ignorar letras maiu e min!
		//poderia colocar o .toLowerCase mas prefiro esse!
		if ("domingo".equalsIgnoreCase(semana)) {
			System.out.println("Domingo e o 1 dia da semana!");
		} else if ("segunda".equalsIgnoreCase(semana)) {
			System.out.println("Segunda e o 2 dia da semana!");
		}  else if ("terça".equalsIgnoreCase(semana)
				|| "terca".equalsIgnoreCase(semana)) {
			System.out.println("Terça e o 3 dia da semana!");
		}  else if ("quarta".equalsIgnoreCase(semana)) {
			System.out.println("Quarta e o 4 dia da semana!");
		}  else if ("quinta".equalsIgnoreCase(semana)) {
			System.out.println("Quinta e o 5 dia da semana!");
		}  else if ("sexta".equalsIgnoreCase(semana)) {
			System.out.println("Sexta e o 6 dia da semana!");
		}  else if ("sábado".equalsIgnoreCase(semana) 
				|| "sabado".equalsIgnoreCase(semana) ) {
			System.out.println("Sábado e o 7 dia da semana!");
		} else {
			System.out.println("Invalido!!!");
		}
		//utilizar == em comparação com Strings vai dar errado, o certo é .equals()!
		entrada.close();
	}
}
