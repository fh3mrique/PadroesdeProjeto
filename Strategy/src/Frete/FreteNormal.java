package Frete;

public class FreteNormal implements StrategyFrete{

    @Override
    public double calcularFrete(double peso) {
       return peso * 1.5;
    }
    
}
