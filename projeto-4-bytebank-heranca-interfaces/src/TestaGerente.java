public class TestaGerente {
    public static void main(String[] args) {
        /*
             testando atributos de Gerente, subclasse herdada de Funcionarios
             Gerente eh um Funcionario com alguns atributos e comportamentos
             analogos a um tipo Funcionario
         */

        // testando primeiro gerente
//        Gerente g1 = new Gerente();
//        g1.setNome("Renato Felício");
//        g1.setCpf("04557665190");
//        g1.setSalario(5000.00);
//
//        System.out.println(g1.getNome());
//        System.out.println(g1.getCpf());
//        System.out.println(g1.getSalario());

        /*
            // verificando autenticacao de senha
            boolean autenticou = g1.autentica(1234);
            // false pois o construtor padrao seta os atributos int/double com zero
            // e String como null -> pratica ruim devolver ponteiro nulo
            System.out.println(autenticou);
        */
        // defininando agora metodo setSenha
//        g1.setSenha(1234);
//        boolean autenticou = g1.autentica(1234);
//        System.out.println(autenticou);

//        testa heranca (0, null)
//        Gerente g2 = new Gerente();
//        System.out.println(g2.getNome());
//        System.out.println(g2.getCpf());
//        System.out.println(g2.getSalario());

        // tratando getBonificacao
        Gerente gerenteTeste = new Gerente();
        gerenteTeste.setNome("Renato Felício");
        gerenteTeste.setCpf("04557665190");
        gerenteTeste.setSalario(5000.00);
        gerenteTeste.setSenha(1234);
        boolean autenticou = gerenteTeste.autentica(1234);
        System.out.println(autenticou);

        System.out.println(gerenteTeste.getNome());
        System.out.println(gerenteTeste.getCpf());
        System.out.println(gerenteTeste.getSalario());
        /*
            aqui surge um problema: e se for requisitada uma mudanca
            na super classe, ou mesmo nas classes filhas, que deve
            reverberar para os seus semelhantes...

            metodos deverao ser alterados em cada uma das classes filhas e/ou
            na super classe...

            qual a maneira de seguir  Dont Repeat Yourself - DRY;
            menos verbosidade, menos complexa...

            alteracao no getBonificacao() at Funcionarios e Gerente
         */

        System.out.println(gerenteTeste.getBonificacao());

    }
}
