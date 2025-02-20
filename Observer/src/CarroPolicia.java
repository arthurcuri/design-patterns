import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CarroPolicia implements PropertyChangeListener, Carro {

    @Override
    public void frente() {
        System.out.println("Viatura segue em frente.");
    }

    @Override
    public void direita() {
        System.out.println("Viatura vira à direita.");
    }

    @Override
    public void esquerda() {
        System.out.println("Viatura vira à esquerda.");
    }

    @Override
    public void para() {
        System.out.println("Viatura para.");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String acao = (String) evt.getNewValue();
        switch (acao) {
            case "frente" -> frente();
            case "direita" -> direita();
            case "esquerda" -> esquerda();
            case "para" -> para();
        }
    }
}
