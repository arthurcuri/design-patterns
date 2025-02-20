public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("12279768607");
        
        validarPessoa(p1, new ValidarPessoaFisica());
        validarPessoa(p1, new ValidarPessoaJuridica());
        
    }

    public static void validarPessoa(Pessoa p, Validacao v){
        v.validar(p);
    }
}
