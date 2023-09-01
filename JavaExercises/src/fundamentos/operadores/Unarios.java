package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
// operadores unarios atem um operando e varios operadores!
// operador pós-fixado onde é avaliado o valor original!
		int a = 1;
		int b = 2;
		a++; //equivale , a = a + 1
		a--; //equivale , a = a  - 1
//isso vale para valores INT, BYTE, SHORT, etc.
		System.out.println(a);
/*temos a forma pré-fixada onde o valor já é incrementado,
e tem mais precedencia*/
		++b; // b = b + 1
		--b; // b = b  - 1
		
		System.out.println(++a==b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
