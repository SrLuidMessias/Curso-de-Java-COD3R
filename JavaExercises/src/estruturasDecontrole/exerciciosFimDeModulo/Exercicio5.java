package estruturasDecontrole.exerciciosFimDeModulo;
//Refatorar o exercício 04, utilizando a estrutura switch.
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		int contador = 0;
		for (int i = 2; i < numero; i++) {
		if (numero % i == 0) {
			contador++;
		}	
		}	
			switch(contador ) {
		case 0 :
			System.out.printf("Número %d primo ", numero);
			break;
		default:
			System.out.printf("Número %d composto", numero);
		}
		
		
		entrada.close();
		
		
	}

}
