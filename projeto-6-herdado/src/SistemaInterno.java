public class SistemaInterno {

    private int senha = 1234;

    public void autenticar(Gerente g) {
        System.out.println(g.autenticar(this.senha) ? "Pode entrar no sistema!" : "Não pode entrar no sistema!");
    }
}
