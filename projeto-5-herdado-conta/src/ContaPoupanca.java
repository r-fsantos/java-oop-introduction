public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }
    @Override // intentional overwrite
    public boolean sacar(double valor) {
        return super.sacar(valor);
    }

    @Override
    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }
}
