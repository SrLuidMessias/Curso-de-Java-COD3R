package estruturasDecontrole;

public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
//continue - ele para a itera��o de impar e vai para a proxima , par!		
//quando o valor � verdadeiro (impar) ele interrompe aquela repeti��o e vai para pr�xima (par)
			}
			System.out.println(i);
		}
	
	
	}
}
