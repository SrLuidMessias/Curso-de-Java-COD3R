package fundamentos;



public class Wrapper {
	public static void main(String[] args) {
		
		
		Byte b = 100;
		Short s = 1000;
		
//Converte o valor String para Int  com Interger.parseInt

		Integer i = 10000;
		Long l = 100000L;

		System.out.println(b.byteValue() + " O valor da classe de fato");
		System.out.println(s.toString() + " Valor String ");
		System.out.println(i * 5);
		System.out.println(l / 3);
//Converte String para Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
//Converte Boolean para String
		System.out.println(bo.toString().toUpperCase());
		
		
	}
}
