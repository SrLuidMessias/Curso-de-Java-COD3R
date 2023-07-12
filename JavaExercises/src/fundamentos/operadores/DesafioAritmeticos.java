package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String []args) {
		
		
		int c = ((3+2)*6);
		int d = (int) Math.pow(c, 2);
		int e = d/(3*2);  
		System.out.println(e + " -");
		
		int a = (1-5)*(2-7) / 2 ;
		int b = (int) Math.pow(a, 2) ;
		System.out.println(b);
		System.out.println("-----------");
		
		int rescin = e - b ; 
		int multcin = (int) Math.pow(rescin, 3);
		System.out.println(rescin + " Elevado ao cubo e " + multcin);
				
		int multten = (int) Math.pow(10, 3);
		System.out.println("10 elevado ao cubo e "+multten);
		
		int finaldiv = multcin / multten ;
		System.out.println("125000 divido por 1000 e " + finaldiv);
		System.out.println("Resposta final e " + finaldiv);
	}
}
