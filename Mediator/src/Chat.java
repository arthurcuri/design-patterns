import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Chat implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void enviarMensagem(String m, Usuario u) {
        System.out.println(new Date().toString() + " - [ " + u.getNome() + " ]: " + m);
    }

    @Override
    public void adicionarUsuario(Usuario u) {
        usuarios.add(u);
    }
}