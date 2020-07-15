public abstract class Conta {
    private int agencia;
    private int numero; // numero da conta
    protected double saldo;
    private static int total = 0;
    private Autenticavel titular; // composicao de Cliente e Conta

    public Conta(int agencia, int numero) { // constructor method --> initialization routine
       Conta.total ++;
       System.out.println("Estou criando uma conta.");
       System.out.println("O total de contas é " + Conta.total);
       this.agencia = agencia;
       this.numero = numero;
       this.saldo = 100; // saldo inicial de 100 reais
    }

    public static int getTotal() {
        return Conta.total;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public abstract boolean depositar(double valor);

    public boolean transferir(double valor, Conta destino) {
        return this.sacar(valor) ? destino.depositar(valor) : false;
    }

    public boolean sacar(double valor) {
        if(this.saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(Autenticavel titular) {
        this.titular = titular;
    }

    public Autenticavel getTitular() {
        return titular;
    }
}

