public class TestaGetESet {
    public static void main(String[] args) {
        // cria conta para teste de getter e setter - linkar Clinte e Conta
        Conta conta = new Conta();
        conta.setNumero(388580);
        System.out.println(conta.getNumero());

        // cria cliente
        Cliente renato = new Cliente();
        renato.setNome("Renato Felício dos Santos Júnior.");
        conta.setTitular(renato);

        // nome do Cliente Renato
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Estudante");
        System.out.println(conta.getTitular().getProfissao());
    }
}