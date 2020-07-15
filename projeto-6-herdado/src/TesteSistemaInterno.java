public class TesteSistemaInterno {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1234);
        Administrador adm = new Administrador();
        adm.setSenha(3333);
        Cliente cliente = new Cliente();
        cliente.setSenha(1234);

        SistemaInterno siTeste = new SistemaInterno();
        siTeste.autenticar(g);
        siTeste.autenticar(adm);
        siTeste.autenticar(cliente);


    }
}
