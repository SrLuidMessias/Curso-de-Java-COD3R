package estruturasDecontrole.exerciciosFimDeModulo;
//Criar um programa que enquanto estiver recebendo n�meros 
//positivos, imprime no console a soma dos n�meros inseridos, caso
//receba um n�mero negativo, encerre o programa. Tente utilizar 
//a estrutura do while
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String []args) {
		Scanner entrada = new Scanner(System.in);

	int valor = 0;
	int soma = 0;
	
	while (valor >= 0 ){
		System.out.println("Digite um n�mero ou um n�mero negativo para sair :");
		valor = entrada.nextInt();
		if (valor >= 0) {
			soma += valor;
			System.out.printf("Total somado = %d\n", soma);
		}
	}
	System.out.println("Voc� saiu!");
	entrada.close();
	}
}
