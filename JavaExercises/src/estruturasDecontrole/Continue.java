package estruturasDecontrole;

public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
//continue - ele para a iteração de impar e vai para a proxima , par!		
//quando o valor é verdadeiro (impar) ele interrompe aquela repetição e vai para próxima (par)
			}
			System.out.println(i);
		}
	
	
	}
}
