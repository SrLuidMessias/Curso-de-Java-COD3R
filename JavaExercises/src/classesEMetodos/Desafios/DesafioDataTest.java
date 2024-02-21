package classesEMetodos.Desafios;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class DesafioDataTest {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		DesafioData p1 = new DesafioData();
		
		System.out.println("Escreva seu dia de nascimento ->");
		p1.dia = entrada.nextInt();
		
		System.out.println("Escreva seu Mês de nascimento ->");
		p1.mes = entrada.nextInt();
		
		System.out.println("Escreva seu ano de nascimento ->");
		p1.ano = entrada.nextInt();
		
		
		
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int anoAtual = calendar.get(Calendar.YEAR);
		

		System.out.printf("nascimento %d/%d/%d \n",p1.dia,p1.mes,p1.ano);
        System.out.printf("Você tem %d anos \n",anoAtual - p1.ano);
		
        
        String [] meses = {"Janeiro", "Fevereiro","Março","Abril", "Maio","junho"
        		,"julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        
        
        if (p1.mes >=1 && p1.mes <=12) {
			System.out.printf("Nasceu em %s", meses[p1.mes - 1]);
		} else {
			System.out.println("Mês Inválido");
		}
        
        
        /*System.out.printf("Nasceu em %s", (p1.mes == 2 ? meses[2]: false) );
        System.out.printf("Nasceu em %s", (p1.mes == 3 ? meses[3]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 4 ? meses[4]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 5 ? meses[5]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 6 ? meses[6]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 7 ? meses[7]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 8 ? meses[8]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 9 ? meses[9]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 10 ? meses[10]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 11 ? meses[11]: 0) );
        System.out.printf("Nasceu em %s", (p1.mes == 12 ? meses[12]: 0) );
*/        
        entrada.close();
	}
}
