package fundamentos.operadores;

public class Ternario {
	public static void main (String []args) {
		double media = 5.0;
/* 
 * Aqui temos uma expressÃ£o condicional, pois pode ser verdadeira ou falsa
 */	
		String resultadoRecuperação = media >= 5.0 ? " em recuperaÃ§Ã£o" : "reprovado";
		String resultado = media  >= 7.0? "Aprovado":  resultadoRecuperação;
		System.out.println(resultado);
		
		
		
		
		
	}
}
