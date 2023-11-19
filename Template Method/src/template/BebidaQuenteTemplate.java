package template;

//O template deve ser uma classe abstrata
public abstract class BebidaQuenteTemplate {

    //Template Method
    public final void prepararBebidaQuente(){
        ferverAgua(); //comum
        prepararIngredientes(); //especifico
        despejarNaChicara(); //comum
        adicionarCondimentos(); //especifico
    }
    
    // Métodos abstratos que serão implementados pelas subclasses
    abstract void prepararIngredientes();
    abstract void adicionarCondimentos();

    // Métodos comuns implementados na classe abstrata
    public void ferverAgua(){
        System.out.println("Fervendo a água");
    }

    public void despejarNaChicara(){
        System.out.println("Despejando conteúdo na xicará");
    }


    
}