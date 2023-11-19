package template;

// Subclasse que implementa os passos específicos para fazer chá
public class Cha extends BebidaQuenteTemplate{

    @Override
    void prepararIngredientes() {
        System.out.println("Infundindo as folhas de chá");
    }

    @Override
    void adicionarCondimentos() { 
        System.out.println("Adicionando limão");
    }
    
}
