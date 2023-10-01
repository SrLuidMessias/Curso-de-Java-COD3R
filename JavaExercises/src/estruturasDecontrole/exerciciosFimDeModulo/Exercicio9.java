package estruturasDecontrole.exerciciosFimDeModulo;
//Crie um programa que recebe 10 valores 
//e ao final imprima o maior número.
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = 0;
		int MaiorValor = 0;
			for (int j = 1; j < 11; j++) {
				
				System.out.printf("Digite o %d° número ", j);
				valor = entrada.nextInt();
				if (valor > MaiorValor) {
					MaiorValor = valor;
				}
			}
		System.out.println("Maior valor é " + MaiorValor);
		entrada.close();

	}

}
