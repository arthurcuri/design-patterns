public class ValidarPessoaFisica implements Validacao {

    @Override
    public void validar(Pessoa pessoa) {
        if(pessoa.getRegistro().length() != 11){
            throw new IllegalArgumentException("Problema com o CPF!");
        }
    }
}
