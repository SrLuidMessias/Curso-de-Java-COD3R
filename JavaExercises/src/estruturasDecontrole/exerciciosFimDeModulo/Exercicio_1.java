package estruturasDecontrole.exerciciosFimDeModulo;
//1. Criar um programa que receba um n�mero 
//e verifique se ele est� entre 0 e 10 e � par;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero de 1 a 10 :");
		int numero = entrada.nextInt();
		if (numero % 2 == 1) {
			System.out.println("Ele � impar!");
		} else {
			System.out.println("Ele � par!");
		}
		
		

		entrada.close();
	}

}
