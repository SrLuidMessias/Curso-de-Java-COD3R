package fundamentos;

public class TiposPrimitivosAula {

	public static void main(String[] args) {
		// tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_124_845_223L;
		
		// tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false; 
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365  + " dias trabalhados");
		// numeros de viagens
		System.out.println(numeroDeVoos / 2 + " numeros de viagens");
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas + " pontos acumulados");
		System.out.println(id + ": ganha --> " +  salario);
		System.out.println("ferias? " + estaDeFerias);

		
		

	}

}
