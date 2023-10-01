package estruturasDecontrole.exerciciosFimDeModulo;
//Criar um programa que enquanto estiver recebendo números 
//positivos, imprime no console a soma dos números inseridos, caso
//receba um número negativo, encerre o programa. Tente utilizar 
//a estrutura do while
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String []args) {
		Scanner entrada = new Scanner(System.in);

	int valor = 0;
	int soma = 0;
	
	while (valor >= 0 ){
		System.out.println("Digite um número ou um número negativo para sair :");
		valor = entrada.nextInt();
		if (valor >= 0) {
			soma += valor;
			System.out.printf("Total somado = %d\n", soma);
		}
	}
	System.out.println("Você saiu!");
	entrada.close();
	}
}
