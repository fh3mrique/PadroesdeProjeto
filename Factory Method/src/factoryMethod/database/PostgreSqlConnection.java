package factoryMethod.database;

// Implementação do produto para conexão PostgreSQL
public class PostgreSqlConnection implements DataBaseConection {

    @Override
    public void conectar() {
        System.out.println("Conectando ao PostgreSQL Database");
    }

    @Override
    public void desconectar() {
         System.out.println("Desconectando do PostgreSQL Database");
    }
    
}
