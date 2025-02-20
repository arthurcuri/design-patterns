public class ValidarPessoaJuridica implements Validacao {

    @Override
    public void validar(Pessoa pessoa) {
        if(pessoa.getRegistro().length() != 14){
            throw new IllegalArgumentException("Problema com o CNPJ!");
        }
    }
}
