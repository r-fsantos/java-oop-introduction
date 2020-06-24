public class TestaReferencias {

    public static void main(String[] args) {
        // breve entendimento sobre polimorfismo
        /*
            Funcionario g2 = new Gerente();
            g2.setNome("Felício");
            String pegaNomeParaTeste2 = g2.getNome();
            System.out.println(pegaNomeParaTeste2);
            g2.setSenha(1234);

            nao funciona, pois o metodo setSenha faz referencia ao tipo gerente
            o objeto criado por new Gerente() criou uma referencia na memoria
            que foi associada g2. Todavia, g2 eh do tipo funcionario. Nenhum erro ate entao

            porem, quando um metodo especifico da classe Gerente() eh chamado, nao eh encontrado
            pois a referencia eh do tipo Funcionario --> o compilador analisa o tipo de referencia
            que, nesse caso, aponta para a classe Funcionario...

            tambem faz sentido do ponta de vista evolutivo

            polimorfismo aparece quando a criacao de uma subclasss a partir de uma superclass
            a superclass contem a subclass, a reciproca nao eh verdadeira...

            a superclass nao herda caracteristicas da subclass...

            todo gerente eh um funcionario, mas nem todo funcionario eh gerente... (polimorfismo)

            mais de uma forma de se referir a um objeto (polimorfismo)

            como, entao, nesses moldes, promover um funcionario comum a gerente?

        */
        // erro intencional, para mostrar uma reciproca naum verdadeira
        /*
            Gerente g3 = new Funcionario(); ERRO, NAUM "CABE"
            g3.setNome("dos Santos Júnior");
            String pegaNomeParaTeste3 = g3.getNome();
            System.out.println(pegaNomeParaTeste3);
         */

        // objeto do tipo Gerente
        Gerente g1 = new Gerente();
        g1.setNome("Renato");
        g1.setSalario(5000.00);
        System.out.println(g1.getNome());

        Funcionario f1 = new Funcionario();
        f1.setNome("João Vitor");
        f1.setSalario(2000.00);
//        System.out.println(f1.getBonificacao());

        EditorDeVideo ev1 = new EditorDeVideo();
        ev1.setNome("Tarilia Gomes");
        ev1.setSalario(2500.00);

        Designer d1 = new Designer();
        d1.setNome("Renato Santos");
        d1.setSalario(1000.00);

        // implementando polimorfismo
        ControleBonificacao controle = new ControleBonificacao();
        controle.registrarTotalDeBonificacoes(g1);
        controle.registrarTotalDeBonificacoes(f1);
        controle.registrarTotalDeBonificacoes(ev1);
        controle.registrarTotalDeBonificacoes(d1);
        System.out.println(controle.getSoma());


    }
}
