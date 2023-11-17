package Frete;

public class FreteGratis implements StrategyFrete {

    @Override
    public double calcularFrete(double peso) {
      return 0;
    }
    
}
