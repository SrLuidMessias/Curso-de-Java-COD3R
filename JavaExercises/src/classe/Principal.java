package classe;

public class Principal {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.preço = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "tablet";
		p2.preço = 1.300;
		p2.desconto = 0.10;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		
		double preçoFinal1 = p1.preço * (1-p1.desconto);
		double preçoFinal2 = p2.preço * (1-p2.desconto);
		double media = (preçoFinal1 + preçoFinal2)/2;
		
		System.out.printf("Media do carrinho R$%.2f.", media);
		
		
		
		
	}

}
