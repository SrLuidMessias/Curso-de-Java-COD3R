package fundamentos.operadores;

public class Logicos {
	public static void main(String []args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
//tabela verdade E :
System.out.println("\ntabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);//dead code 
		System.out.println(false && false);//dead code
//tabela verdade OU :
System.out.println("\ntabela verdade OU (OR)");
		System.out.println(true || true);//dead code
		System.out.println(true || false);//dead code
		System.out.println(false || true); 
		System.out.println(false || false);
//tabela verdade XOR :
System.out.println("\ntabela verdade XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true); 
		System.out.println(false ^ false);
//tabela verdade NOT :
System.out.println("\ntabela verdade NOT");	
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
	
	}
}
