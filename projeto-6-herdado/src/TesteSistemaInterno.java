public class TesteSistemaInterno {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1234);

        SistemaInterno siTeste = new SistemaInterno();
        siTeste.autenticar(g);
    }
}
