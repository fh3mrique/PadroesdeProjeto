package contexto;

import Frete.StrategyFrete;

public class CarrinhoDeCompras {

    private StrategyFrete estrategiaFrete;

    public CarrinhoDeCompras(StrategyFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularTotalCompra (double valorProduto, double pesoProduto){
        double frete = estrategiaFrete.calcularFrete(pesoProduto);

        double valorTotal = valorProduto + frete;

        return valorTotal;
    }
    
    
}
