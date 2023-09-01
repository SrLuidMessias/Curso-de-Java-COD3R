package estruturasDecontrole;
import java.util.Scanner;
public class WhileInderteminado {
	
	public static void main(String[] x) {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
/*
 * while ficaria sendo executado sempre
 *  que o valor for diferente de sair
 */
		while(!valor.equalsIgnoreCase("sair")){
			System.out.print("Você diz: ");
//caso colocasse sÃ³ "entrada.nextLine" teria um lasso infinito 
			valor = entrada.nextLine();
		}
		
		
		entrada.close();
	}
}
