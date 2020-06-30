public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override // intentional overwrite
    public boolean sacar(double valor) {
        double valorAtualizado = valor + 0.2;
        return super.sacar(valorAtualizado); // taxa de saque da ContaCorrente
    }
}

