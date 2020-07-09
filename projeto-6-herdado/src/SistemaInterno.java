public class SistemaInterno {

    private int senha = 1234;

    public void autenticar(Autenticavel autenticavel) {
        System.out.println(autenticavel.autenticar(this.senha) ? "Pode entrar no sistema!" : "Não pode entrar no sistema!");
    }
}

