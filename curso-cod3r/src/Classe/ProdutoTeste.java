package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		// ou var
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		
		//Produto.desconto = 0.30; -> Desconto de natal
		//Produto.desconto = 0.20; -> Desconto de dias das mães
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		System.out.println(p1.nome);
		System.out.println(precoFinal1);
		System.out.println(p2.nome);
		System.out.println(precoFinal2);
		
		
		// mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		//.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
	}

}
