public class TestaBanco {
	public static void main(String[] args) {
	    Cliente renato = new Cliente();

	    renato.nome = "Renato Felício";
	    renato.cpf = "045.567.598-97";
	    renato.profissao = "Estudante";

	    Conta contaDoRenato = new Conta();
	    contaDoRenato.deposita(100);

	    System.out.println("Saldo da conta do Renato R$ "+contaDoRenato.saldo+" Reais");

	    // duas classes ate o momento -> como associar/referenciar os objetos de dois tipos diferentes?
		// composicao de objetos
		contaDoRenato.titular = renato;
		System.out.println(contaDoRenato.titular.nome);
		System.out.println(renato);
    }
}
