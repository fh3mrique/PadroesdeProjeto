import Frete.FreteExpresso;
import Frete.FreteGratis;
import Frete.FreteNormal;
import Frete.StrategyFrete;
import contexto.CarrinhoDeCompras;

public class Cliente {
    public static void main(String[] args) {
        
        // Escolhendo a estratégia de frete
        StrategyFrete freteNormal = new FreteNormal();
        StrategyFrete freteExpresso = new FreteExpresso();
        StrategyFrete freteGratis = new FreteGratis();

        // Criando instâncias do carrinho com diferentes estratégias de frete
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras(freteNormal);
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras(freteExpresso);
        CarrinhoDeCompras carrinho3 = new CarrinhoDeCompras(freteGratis);

        // Calculando o total de compras para cada carrinho
        double totalCarrinho1 = carrinho1.calcularTotalCompra(100.0, 5.0);
        double totalCarrinho2 = carrinho2.calcularTotalCompra(100.0, 5.0);
        double totalCarrinho3 = carrinho3.calcularTotalCompra(100.0, 5.0);

        // Exibindo os resultados
        System.out.println("Total Carrinho 1: $" + totalCarrinho1);
        System.out.println("Total Carrinho 2: $" + totalCarrinho2);
        System.out.println("Total Carrinho 3: $" + totalCarrinho3);
    }
    
}