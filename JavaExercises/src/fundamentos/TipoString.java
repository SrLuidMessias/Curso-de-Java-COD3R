package fundamentos;
public class TipoString {

	public static void main(String[] args) {
//------------------------------------------------------------------------------------------------------------------------------
// Sem o ln no final, os elementos de dentro vão ser executados na mesma linha!
		System.out.print("Bom");
		System.out.print(" Dia!");
// print formatado
		System.out.printf(" animais : %s %s %s ", "macaco", "leão", "zebra");
//-------------------------------------------------------------------------------------------------------------------------------
		String frase = "Ola, tudo BEM";
		System.out.println(frase.concat("???"));
		System.out.println(frase + " arrombado");
		System.out.println("A frase comeca com Ola?" + " :" + frase.startsWith("Ola"));
		System.out.println( "minusculo? " + frase.toLowerCase().startsWith("ola"));
		System.out.println( "termina com BEM? " + frase.endsWith("BEM"));
		System.out.println("Fraser tem " + frase.length() + " caracteres");
////!!var can't be used when value was already analyzed 		
		var nome = "Luid";
		var sobrenome = "Pereira";
		var idade = 19; 
		var salario = 10.000;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.4f " , nome, sobrenome, idade , salario);

		String eu = String.format("\nO senhor %s %s tem %d anos e ganha R$%.4f " , nome, sobrenome, idade, salario);
		System.out.println(eu);
// --\n -- serve para quebrar a linha para "baixo" 
// -- %s -- format em string 
// -- %d --  format em inteiro	
// -- %f -- format em float
// -- %.4f -- mostrar 4 casas depois da virgula
		
		
	}

}
