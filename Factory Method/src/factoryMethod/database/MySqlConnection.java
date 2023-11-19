package factoryMethod.database;

// Implementação do produto para conexão MySql
public class MySqlConnection  implements DataBaseConection{

    @Override
    public void conectar() {
       System.out.println("Conectando ao MySql");
    }

    @Override
    public void desconectar() {
       System.out.println("Desconectando do MySQL Database");
    }
    
}
