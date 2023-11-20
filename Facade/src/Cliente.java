import cinema.facade.CinemaFacade;

public class Cliente {
    public static void main(String[] args) throws Exception {

        CinemaFacade cinemaFacade = new CinemaFacade();

        cinemaFacade.noiteNoCinema("Naruto Shippuden", 2, 25.00);

    }
}
