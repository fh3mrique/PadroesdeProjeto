package factoryMethod.database;

// Produto: Interface comum para conexões de banco de dados
public interface DataBaseConection {
    void conectar();

    void desconectar();
}