public class EcommerceFacade {

    private Estoque estoque;
    private Pagamento pagamento;
    private Envio envio;

    public EcommerceFacade() {
        this.estoque = new Estoque();
        this.pagamento = new Pagamento();
        this.envio = new Envio();
    }

    public void processarPedido(String produtoId, String usuarioId){
        if(estoque.checarEstoque(produtoId) && pagamento.processarPagamento(usuarioId)){
            envio.enviarProduto(produtoId, usuarioId);
        }else{
            System.out.println("Não foi possivel processar o pedido para o usuario " + usuarioId);
        }
    }
}