package estruturasDecontrole;

public class Break {
//break responsavel por quebrar o fluxo 
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("fim");
	
	}
}
