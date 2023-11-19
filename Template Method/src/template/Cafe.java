package template;

// Subclasse que implementa os passos específicos para fazer café
public class Cafe extends BebidaQuenteTemplate {

    @Override
    void prepararIngredientes() {
        System.out.println("Moendo café");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando açucar e leite");
    }
    
}
