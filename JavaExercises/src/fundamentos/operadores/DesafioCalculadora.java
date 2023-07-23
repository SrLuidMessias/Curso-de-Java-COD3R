package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[]x) {
		Scanner entrada =  new Scanner (System.in); 
	
		System.out.println("Digite um número");
		int valor = entrada.nextInt();
		
		System.out.println("Digite outro número");
		int valor1 = entrada.nextInt();
		
		System.out.println("Digite a operação");
		String op = entrada.next();
				
//logica - colei :)
		int resultado = "+".equals(op) ? valor + valor1 : 0 ;
		resultado = "-".equals(op)? valor - valor1 : resultado;
		resultado = "*".equals(op)? valor * valor1 : resultado;
		resultado = "/".equals(op)? valor / valor1 : resultado;
		resultado = "%".equals(op)? valor % valor1 : resultado;
		System.out.printf("%d %s %d = %d", valor, op, valor1, resultado);
		entrada.close();
	}
}
