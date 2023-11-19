import template.BebidaQuenteTemplate;
import template.Cafe;
import template.Cha;

// Classe cliente que utiliza as subclasses
public class Cliente {
    public static void main(String[] args) throws Exception {
        
        BebidaQuenteTemplate cafe = new Cafe();
        BebidaQuenteTemplate cha = new Cha();

        System.out.println("PREPARANDO CAFÉ");
        cafe.prepararBebidaQuente();

        System.out.println("\nPREPARANDO CHÁ");
        cha.prepararBebidaQuente();
    }
}
