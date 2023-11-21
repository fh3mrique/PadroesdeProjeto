package adapter;

import interfaceantiga.LeitorCartaoAntigo;
import interfacemoderna.LeitorCartaoModerno;
/*O AdaptadorLeitorCartao atua como uma ponte entre a interface antiga 
(LeitorCartaoAntigo) e a nova interface compatível (LeitorCartaoModerno). 
Isso permite que o leitor de cartões antigo seja utilizado em um sistema 
que espera a nova interface, demonstrando o uso prático do padrão Adapter.
 */
public class AdaptadorLeitorCartao implements LeitorCartaoModerno {

    private LeitorCartaoAntigo leitorAntigo;

    public AdaptadorLeitorCartao(LeitorCartaoAntigo leitorAntigo) {
        this.leitorAntigo = leitorAntigo;
    }

    @Override
    public void lerCartaoModerno() {
        leitorAntigo.lerCartaoAntigo();
    }

}
