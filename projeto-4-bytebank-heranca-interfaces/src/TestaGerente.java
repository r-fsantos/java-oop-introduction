public class TestaGerente {
    public static void main(String[] args) {
        /*
             testando atributos de Gerente, subclasse herdada de Funcionarios
             Gerente eh um Funcionario com alguns atributos e comportamentos
             analogos a um tipo Funcionario
         */

        // testando primeiro gerente
        Gerente g1 = new Gerente();
        g1.setNome("Renato Felício");
        g1.setCpf("04557665190");
        g1.setSalario(5000.00);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        /*
            // verificando autenticacao de senha
            boolean autenticou = g1.autentica(1234);
            // false pois o construtor padrao seta os atributos int/double com zero
            // e String como null -> pratica ruim devolver ponteiro nulo
            System.out.println(autenticou);
        */
        // defininando agora metodo setSenha
        g1.setSenha(1234);
        boolean autenticou = g1.autentica(1234);
        System.out.println(autenticou);



    }
}
