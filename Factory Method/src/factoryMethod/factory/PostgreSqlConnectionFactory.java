package factoryMethod.factory;

import factoryMethod.database.DataBaseConection;
import factoryMethod.database.PostgreSqlConnection;

// Implementação da Factory para conexões Postgres
public class PostgreSqlConnectionFactory implements DatabaseConnectionFactory {

    @Override
    public DataBaseConection criarConexao() {
        return new PostgreSqlConnection();
    }
    
}
