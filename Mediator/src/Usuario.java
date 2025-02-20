public class Usuario {
    private String nome;
    private ChatMediator chat;

    public Usuario(String nome, ChatMediator batePapo) {
        this.nome = nome;
        this.chat = batePapo;
        chat.adicionarUsuario(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void enviarMensagem(String m){
        chat.enviarMensagem(m, this);
    }
}
