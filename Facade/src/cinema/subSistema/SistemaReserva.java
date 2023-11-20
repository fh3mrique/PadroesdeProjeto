package cinema.subSistema;

// Subsistema 1: Sistema de Reservas
public class SistemaReserva {

    public void fazerReserva(String filme, int quantidadeIngressos) {
        System.out.println("Reserva feita para o filme '" + filme + "' para " + quantidadeIngressos + " pessoas.");
    }
}