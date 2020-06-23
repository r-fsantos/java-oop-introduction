public class TestaFuncionarios {

    public static void main(String[] args) {
        Funcionarios renato = new Funcionarios();
        renato.setNome("Renato Felício");
        renato.setCpf("045.576.651-95");
        renato.setSalario(750.00);

        System.out.println(renato.getNome());
        System.out.println(renato.getBonificacao());
    }
}
