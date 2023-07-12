package fundamentos;

import java.util.Scanner;

public class Console {
//!!!complicado!!!
	public static void main(String[] args) {

				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.println("\n\n Seu nome: " + nome + " " + sobrenome );
		
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Seu nome é %s %s e tem %d", nome, sobrenome, idade);
		entrada.close();
		
		if(idade >= 18) {
			System.out.println("\nVoce é adulto ");
		}
		else {
			System.out.println(" \nVoce e menor de idade!");
		}
	}

}
