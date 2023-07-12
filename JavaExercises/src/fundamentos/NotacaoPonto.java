package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia x";
		s = s.replace("x", "voce");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "haha".toUpperCase();
		System.out.println(x);
		
		String y = "bom dia X".replace("X", "my friend").toUpperCase().concat("!!!");
		System.out.println(y);
// Com notação ponto é possivel utilizar um em cada linha (como no primeiro exemplo) 
//  Ou com uma unica sentença de codigo (como no ultimo exemplo)
// Tipos primitivos não tem o operador "."
//	E é com ponto que tenho acesso aos atributos e comportamentos (objetos) das coisas
	}

}
