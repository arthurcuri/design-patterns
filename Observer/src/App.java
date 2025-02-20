public class App {
    public static void main(String[] args) throws Exception {
        //Observador
        CarroPolicia carroPolicia = new CarroPolicia();

        //Observado
        CarroRoubado carroRoubado = new CarroRoubado();

        //Adicionando o Observado ao Observador
        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.esquerda();
        carroRoubado.para();
    }
}
