package factoryMethod.factory;

import factoryMethod.database.DataBaseConection;

// Interface Factory: Define o método para criar conexões de banco de dados
public interface DatabaseConnectionFactory {

     DataBaseConection criarConexao();
} 