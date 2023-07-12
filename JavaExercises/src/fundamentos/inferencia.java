package fundamentos;

public class inferencia {

	public static void main (String[]args) {
		
		var a = "comi tua vó";
		var b =210;
		var c = 3.3;
		var d = 4 * 4;
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// !!! It is possible !!!
		double e; // variable was declared
		e = 123.65; // variable was initializing 
		System.out.println(e); // was used
		//var can't be used when value was already analyzed 
	}
}
