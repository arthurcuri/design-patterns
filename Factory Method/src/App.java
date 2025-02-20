public class App {
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new MySQLFactory();
        ConnectionFactory factory2 = new SQLiteFactory();
        Connection connection = factory.createConnection(); 
        Connection connection2 = factory2.createConnection();

        connection.showStatus();
        connection2.showStatus();
    }
}
