package classe;

public class Principal {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.pre�o = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "tablet";
		p2.pre�o = 1.300;
		p2.desconto = 0.10;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		
		double pre�oFinal1 = p1.pre�o * (1-p1.desconto);
		double pre�oFinal2 = p2.pre�o * (1-p2.desconto);
		double media = (pre�oFinal1 + pre�oFinal2)/2;
		
		System.out.printf("Media do carrinho R$%.2f.", media);
		
		
		
		
	}

}
