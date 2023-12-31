import adapter.AdaptadorLeitorCartao;
import interfaceantiga.LeitorCartaoAntigo;
import interfaceantiga.LeitorCartaoAntigoImpl;
import interfacemoderna.LeitorCartaoModerno;

public class Cliente {
    public static void main(String[] args) throws Exception {
        
        // Usando um leitor de cartão antigo com o adapter
        LeitorCartaoAntigo leitorAntigo = new LeitorCartaoAntigoImpl();
        LeitorCartaoModerno adaptador = new AdaptadorLeitorCartao(leitorAntigo);

        adaptador.lerCartaoModerno();


    }
}
