public class MySQLFactory implements ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }
    
}
