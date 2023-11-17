package Frete;

public class FreteExpresso implements StrategyFrete {

    @Override
    public double calcularFrete(double peso) {
        return peso * 2.5;
    }
    
}
