package estruturasDecontrole;

import java.util.Scanner;

public class EstruturaDeControleif {
	public static void main(String []x) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a media do aluno :");
		double media = entrada.nextDouble();
		
		if(media <= 10 &&media >= 7) { //se não tivesse o "{}" o parabens seria mostrado mesmo se fosse 2.3 (O que está errado!)
			System.out.println("Ok, ele passou!");
		    System.out.println("Parabens");
		}
		if (media < 7 && media >= 4.5)
			System.out.println("recuperacao");
		if(media <4.5 && media >=0)
			System.out.println("Reprovado");
		
		
		
		entrada.close();
	}
}
