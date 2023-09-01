package fundamentos;

public class Convers�oDeTiposPrimitivos {

	public static void main(String[] args) {
//cast define o tipo do valor usando parênteses
		double a = 1;//implicito
		System.out.println(a);
		
		float b = (float) 1.123456788888;//explicito (cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c ;//explicito (cast)
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e;//explícita (cast)
		System.out.println(f);
		
	}

}
