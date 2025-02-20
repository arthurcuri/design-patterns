import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CarroRoubado implements Carro {
    
    private String acao = "";
    private final PropertyChangeSupport support;

    public CarroRoubado() {
        this.support = new PropertyChangeSupport(this);
    }

    @Override
    public void frente() {
        mudarEstado("frente");
    }

    @Override
    public void direita() {
        mudarEstado("direita");
    }

    @Override
    public void esquerda() {
        mudarEstado("esquerda");
    }

    @Override
    public void para() {
        mudarEstado("para");
    }

    private void mudarEstado(String novaAcao) {
        System.out.println("Carro roubado " + novaAcao + ".");
        String acaoAntiga = this.acao;
        this.acao = novaAcao;
        support.firePropertyChange("acao", acaoAntiga, novaAcao);
    }

    public void addObserver(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
