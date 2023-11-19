package factoryMethod.factory;

import factoryMethod.database.DataBaseConection;
import factoryMethod.database.MySqlConnection;

// Implementação da Factory para conexões MySQL
public class MysqlConnectionFactory implements DatabaseConnectionFactory{

    @Override
    public DataBaseConection criarConexao() {
        return new MySqlConnection();
    }
    
}
