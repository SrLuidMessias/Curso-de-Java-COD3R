package estruturasDecontrole;

public class For1 {
	public static void main(String[] args) {
/*
 * For � uma estrutura de controle focada 
 * para uma quantidade pre-definida de repeti��es
 */
//	                defini��o          express�o        encremento                  	
		for(int contador = 10; contador >= 1; contador --) {
			System.out.printf("Contador %d\n", contador);
		}
//n�o � obrigado a definir as tr�s partes definidas!!!
		int x = 1;
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
//laço infinito com for
//		for(; true;) { //você pode tirar o true que vai dar na mesma
//			System.out.println("Fim");
//		}
	}
}
