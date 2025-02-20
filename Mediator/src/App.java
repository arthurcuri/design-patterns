public class App {
    public static void main(String[] args) {
        ChatMediator chat = new Chat();

        Usuario u1 = new Usuario("Arthur", chat);
        Usuario u2 = new Usuario("Luiz", chat);

        u1.enviarMensagem("Oi Luiz.");
        u2.enviarMensagem("Olá Arthur.");
    }
}
