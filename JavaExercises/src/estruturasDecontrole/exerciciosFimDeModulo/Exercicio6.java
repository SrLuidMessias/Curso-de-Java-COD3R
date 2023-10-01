package estruturasDecontrole.exerciciosFimDeModulo;
//Jogo da adivinha��o: Tentar adivinhar um n�mero entre 
//0 - 100. Armazene um numero aleat�rio em uma vari�vel. 
//O Jogador tem 10 tentativas para adivinhar o n�mero gerado. 
//Ao final de cada tentativa, imprima a quantidade de tentativas 
//restantes, e imprima se o n�mero inserido � maior ou menor 
//do que o n�mero armazenado.
import java.util.Random;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random numrand = new Random();
		int a = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero de 0 a 100 : ");
			int num = entrada.nextInt();
			
			int aleatorio = numrand.nextInt(100);
			System.out.println("N�mero aleatorio " + aleatorio);
			System.out.println("Seu n�mero " +num);
			
			a++;
			
			if (num == aleatorio ) {
				System.out.println("S�o iguais, voc� ganhou");
				System.out.printf("%d tentativas e %d tentativas restantes", a, 10 - a);
				break;
			} else if(a == 10){
				System.out.println("0 tentativas restantes, voc� perdeu!");
				break;
			} else if (num > aleatorio) {
				System.out.println("N�mero inserido � maior do que n�mero aleat�rio! ");
			}		
			} 
			//System.out.printf("%d tentativas e %d tentativas restantes", a, 10 - a);
		entrada.close();
	}
}
