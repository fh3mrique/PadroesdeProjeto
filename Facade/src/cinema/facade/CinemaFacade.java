package cinema.facade;

import cinema.subSistema.SistemaExibicao;
import cinema.subSistema.SistemaPagamento;
import cinema.subSistema.SistemaReserva;

/*  Fachada: FachadaCinema simplifica a complexidade de 
interagir com diferentes subsistemas de um cinema, como SistemaReserva, 
SistemaPagamento e SistemaExibicao.*/
public class CinemaFacade {

    private SistemaReserva sistemaReserva;
    private SistemaPagamento sistemaPagamento;
    private SistemaExibicao sistemaExibicao;

    public CinemaFacade() {
        this.sistemaReserva = new SistemaReserva();
        this.sistemaPagamento = new SistemaPagamento();
        this.sistemaExibicao = new SistemaExibicao();
    }

    // Método simplificado para realizar uma noite completa no cinema
    public void noiteNoCinema(String filme, int quantidadeIngressos, double preco) {
        sistemaReserva.fazerReserva(filme, quantidadeIngressos);
        sistemaPagamento.realizarPagamento(preco);
        sistemaExibicao.iniciarExibicao(filme);
    }
}
