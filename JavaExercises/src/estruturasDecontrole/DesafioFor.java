package estruturasDecontrole;

public class DesafioFor {

	public static void main(String[] args) {
//meu desafio
		System.out.println("---------Meu modo--------");
		String valor = "#";
		String valor2 = "######";
		for (String i = valor; i.equals(i)  ; i += "#") {
			System.out.println(valor );
			valor = valor + "#";
			if (valor.equals(valor2)) {
				break;
			}
			}
		System.out.println("-----------Modo do Professor----------");
//desafio do professor:
		for (String v = "#"; !v.equals("######"); v += "#" ) {
			System.out.println(v);
		}
	}

}
