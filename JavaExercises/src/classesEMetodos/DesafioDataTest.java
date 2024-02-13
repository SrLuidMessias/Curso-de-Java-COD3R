package classesEMetodos;
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
		
        
        if (p1.mes == 01) {
			System.out.printf("dia %d de janeiro", p1.dia);
		}else if (p1.mes == 02) {
			System.out.printf("dia %d de fevereiro", p1.dia);
		}else if (p1.mes == 3) {
			System.out.printf("dia %d de Março",p1.dia);
		}else if (p1.mes == 4) {
			System.out.printf("dia %d de Abril",p1.dia);
		}else if (p1.mes == 5) {
			System.out.printf("dia %d de Maio",p1.dia);
		}else if (p1.mes == 6) {
			System.out.printf("dia %d de Junho",p1.dia);
		}else if (p1.mes == 7) {
			System.out.printf("dia %d de Julho",p1.dia);
		}else if (p1.mes == 8) {
			System.out.printf("dia %d de Agosto",p1.dia);
		}else if (p1.mes == 9) {
			System.out.printf("dia %d de Setembro",p1.dia);
		}else if (p1.mes == 10) {
			System.out.printf("dia %d de Outubro",p1.dia);
		}else if (p1.mes == 11) {
			System.out.printf("dia %d de Novembro",p1.dia);
		}else if (p1.mes == 12) {
			System.out.printf("dia %d de Dezembro",p1.dia);
		}
		entrada.close();
	}

}
