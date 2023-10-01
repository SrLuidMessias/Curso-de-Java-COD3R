package estruturasDecontrole.exerciciosFimDeModulo;
//Criar um programa que receba duas notas parciais, calcular
//a média final. Se a nota do aluno for maior ou igual a 7.0 
//imprime no console "Aprovado", se a nota for menor que
//7.0 e maior do que 4.0 imprime no console "Recuperação", 
//caso contrário imprime no console "Reprovado".]
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0;
		double media = 0;
		for (double i = 1; i <= 2; i ++) {
			System.out.println("Digite a nota: ");
			double nota = entrada.nextDouble();
			soma += nota;
			media =soma / i;
		} if (media >= 7 ) {
			System.out.println("Aprovado com nota " + media);
		} else if(media < 7 && media > 4 ) {
			System.out.println("Aluno de Recuperação com nota " + media );
		} else {
			System.out.println("Reprovado");
		}
		
		
		
		
		

		entrada.close();
	}
}
