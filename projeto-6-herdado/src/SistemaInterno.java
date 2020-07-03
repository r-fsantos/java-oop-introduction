public class SistemaInterno {

    private int senha = 1234;

    public void autenticar(FuncionarioAutenticavel funcionarioAutenticavel) {
        System.out.println(funcionarioAutenticavel.autenticar(this.senha) ? "Pode entrar no sistema!" : "Não pode entrar no sistema!");
    }
}

