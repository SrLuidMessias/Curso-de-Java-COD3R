package estruturasDecontrole.exerciciosFimDeModulo;
//1. Criar um programa que receba um número 
//e verifique se ele está entre 0 e 10 e é par;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 10 :");
		int numero = entrada.nextInt();
		if (numero % 2 == 1) {
			System.out.println("Ele é impar!");
		} else {
			System.out.println("Ele é par!");
		}
		
		

		entrada.close();
	}

}
