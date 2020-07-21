public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override // intentional overwrite
    public boolean sacar(double valor) {
        double valorAtualizado = valor + 0.2;
        return super.sacar(valorAtualizado); // taxa de saque da ContaCorrente
    }

    @Override
    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}

