package fundamentos.operadores;

public class Ternario {
	public static void main (String []args) {
		double media = 5.0;
/* 
 * Aqui temos uma expressão condicional, pois pode ser verdadeira ou falsa
 */	
		String resultadoRecupera��o = media >= 5.0 ? " em recuperação" : "reprovado";
		String resultado = media  >= 7.0? "Aprovado":  resultadoRecupera��o;
		System.out.println(resultado);
		
		
		
		
		
	}
}
