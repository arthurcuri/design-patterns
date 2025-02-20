public class App {
    //O Factory Method encapsula a criação de objetos, evita acoplamento e torna o código flexível e extensível.
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new MySQLFactory();
        ConnectionFactory factory2 = new SQLiteFactory();
        Connection connection = factory.createConnection(); 
        Connection connection2 = factory2.createConnection();

        connection.showStatus();
        connection2.showStatus();
    }
    /*
    public class Main {
        public static void main(String[] args) {
            MySQLConnection conn = new MySQLConnection(); // Acoplado ao MySQL
            conn.showStatus();
        }
    }*/

    
    //Desacopla a criação do uso: O código que usa um objeto não precisa saber como ele foi criado.
    //Facilita a manutenção: Se a forma de criação mudar, só a fábrica precisa ser alterada.
        //Digamos que o MySQL agora precise de um usuário e senha na conexão.
        //Sem Factory (modificamos vários lugares)
        //Com Factory (modificamos só a fábrica)
    //Permite extensibilidade: Novos tipos de objetos podem ser adicionados sem modificar o código existente.
        //Novos tipos de objetos podem ser adicionados sem modificar o código existente.
        //Digamos que agora queremos adicionar um PostgreSQLConnection.
        //Criamos uma nova fábrica e conexão sem mexer no código já existente:
        
}
