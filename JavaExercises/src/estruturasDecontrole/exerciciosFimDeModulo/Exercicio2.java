package estruturasDecontrole.exerciciosFimDeModulo;
import java.util.Calendar;
// Criar um programa informa se o ano atual � um ano bissexto;
public class Exercicio2 {

	public static void main(String[] args) {
		Calendar ano = Calendar.getInstance();
		int year = ano.get(Calendar.YEAR);
		System.out.println(year);
		//int year = 2024;
		if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
			System.out.println("� um ano bissexto");
		} else {
			System.out.println("N�o � um ano bissexto");
		} 

		
		
		
	}
}
