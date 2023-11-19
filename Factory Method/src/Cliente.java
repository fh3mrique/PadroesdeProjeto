import factoryMethod.database.DataBaseConection;
import factoryMethod.factory.DatabaseConnectionFactory;
import factoryMethod.factory.MysqlConnectionFactory;
import factoryMethod.factory.PostgreSqlConnectionFactory;

public class Cliente {
    public static void main(String[] args) throws Exception {
        
        DatabaseConnectionFactory factoryMySQL  = new MysqlConnectionFactory();

        DataBaseConection mySqlConnection = factoryMySQL.criarConexao();
        mySqlConnection.conectar();
        mySqlConnection.desconectar();

        System.out.println("\n########################\n");

        DatabaseConnectionFactory factoryPostgres  = new PostgreSqlConnectionFactory();

        DataBaseConection PostgresConnection = factoryPostgres.criarConexao();
        PostgresConnection.conectar();
        PostgresConnection.desconectar();

    }
}
