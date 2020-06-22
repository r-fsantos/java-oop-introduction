public class TestaFuncionarios {

    public static void main(String[] args) {
        /*

        Funcionarios renato = new Funcionarios();
        renato.setNome("Renato Felício");
        renato.setCpf("045.576.651-95");
        renato.setSalario(750.00);

        System.out.println(renato.getNome());
        System.out.println(renato.getBonificacao());

         */
        FuncionarioTeste f1 = new FuncionarioTeste();
        f1.setSalario(3000.00);
        System.out.println(f1.getTipo());
        System.out.println(f1.getBonificacao());

        FuncionarioTeste f2 = new FuncionarioTeste();
        f2.setTipo(1);
        f2.setSalario(5000.0);
        System.out.println(f2.getTipo());
        System.out.println(f2.getBonificacao());

    }
}
