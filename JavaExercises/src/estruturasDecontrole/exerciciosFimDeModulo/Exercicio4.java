package estruturasDecontrole.exerciciosFimDeModulo;
//Criar um programa que receba um n�mero e
//diga se ele � um n�mero primo.
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = entrada.nextInt();
		for (int i = 2; i < numero; i++) {
		if (numero % i == 0) {
			contador ++;
			System.out.println(contador);
		}
		}
		if (contador == 0) {
			System.out.println("N�mero primo");
		} else {
			System.out.println("Composto");
		}
		
		
		
		entrada.close();
	}

}
