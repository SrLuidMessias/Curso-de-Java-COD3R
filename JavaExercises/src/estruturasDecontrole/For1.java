package estruturasDecontrole;

public class For1 {
	public static void main(String[] args) {
/*
 * For é uma estrutura de controle focada 
 * para uma quantidade pre-definida de repetições
 */
//	                definição          expressão        encremento                  	
		for(int contador = 10; contador >= 1; contador --) {
			System.out.printf("Contador %d\n", contador);
		}
//não é obrigado a definir as três partes definidas!!!
		int x = 1;
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
//laÃ§o infinito com for
//		for(; true;) { //vocÃª pode tirar o true que vai dar na mesma
//			System.out.println("Fim");
//		}
	}
}
