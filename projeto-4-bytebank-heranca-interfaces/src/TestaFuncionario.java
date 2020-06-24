public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario renato = new Funcionario();
        renato.setNome("Renato Felício");
        renato.setCpf("045.576.651-95");
        renato.setSalario(750.00);

        System.out.println(renato.getNome());
        System.out.println(renato.getBonificacao());
    }
}
