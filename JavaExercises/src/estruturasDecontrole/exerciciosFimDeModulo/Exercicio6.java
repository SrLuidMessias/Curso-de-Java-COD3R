package estruturasDecontrole.exerciciosFimDeModulo;
//Jogo da adivinhação: Tentar adivinhar um número entre 
//0 - 100. Armazene um numero aleatório em uma variável. 
//O Jogador tem 10 tentativas para adivinhar o número gerado. 
//Ao final de cada tentativa, imprima a quantidade de tentativas 
//restantes, e imprima se o número inserido é maior ou menor 
//do que o número armazenado.
import java.util.Random;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random numrand = new Random();
		int a = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número de 0 a 100 : ");
			int num = entrada.nextInt();
			
			int aleatorio = numrand.nextInt(100);
			System.out.println("Número aleatorio " + aleatorio);
			System.out.println("Seu número " +num);
			
			a++;
			
			if (num == aleatorio ) {
				System.out.println("São iguais, você ganhou");
				System.out.printf("%d tentativas e %d tentativas restantes", a, 10 - a);
				break;
			} else if(a == 10){
				System.out.println("0 tentativas restantes, você perdeu!");
				break;
			} else if (num > aleatorio) {
				System.out.println("Número inserido é maior do que número aleatório! ");
			}		
			} 
			//System.out.printf("%d tentativas e %d tentativas restantes", a, 10 - a);
		entrada.close();
	}
}
