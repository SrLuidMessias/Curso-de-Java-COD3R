package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String []args) {
		System.out.println(2 + 3);		
		var x = 34.56;
		double y = 2.2;
		System.out.println(x + y);														
		System.out.println(x - y);														
		System.out.println(x * y);														
		System.out.println(x / y);														
											
//------------------------------------------------------------------------------------		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);														
		System.out.println(a - b);														
		System.out.println(a * b);			
//O double tem mais precisão do que o float em questão de números		
		System.out.println(a / (double) b);														
		System.out.println(a / (float) b);														
//Mesmo resultado		
		System.out.println(a % b);
		System.out.println(8 % 3);
//	Primeiro A * B --- Segundo X + Y --- Terceiro os resultados vão ser subitraidos!
		System.out.println(x + y - a * b);
	}

}
