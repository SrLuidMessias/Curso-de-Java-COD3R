package fundamentos;
import java.util.Scanner;
class TipoStringEquals{
	public static void main(String []args) {
		System.out.println("2"=="2");
		
		String s1 = new String("2");
		System.out.println("2"==s1);
/* O equals compara os conteudos!!! em vez de usar ==, posso usar a funcionalidade 
 * equals!
 */
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
//next ignora espaços (nextLine não!!!)!
		String s2 = entrada.nextLine();
//trim ignora epaços!!!
		System.out.println("2"==s1.trim());
		System.out.println("2".equals(s2.trim()));
		
		
		
		
		
		
		entrada.close();
		
	}
}