public class Conta {
    private int agencia;
    private int numero; // numero da conta
    private double saldo;
    private static int total = 0;
    private Cliente titular; // composicao de Cliente e Conta

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

    /*
        em caso de agencia ser um atributo imutavel, nao ha necessidade desse metodo
        a agencia sera passada como valor a nova conta via metodo construtor
    */
    /*
    public void setAgencia(int agencia) {
        if (agencia <= 0.0) {
            System.out.println("Error message: Negative value. Try again.");
            return;
        }
        this.agencia = agencia;
    }
*/

    public int getNumero(){
        return this.numero;
    }

    /*
        em caso de numero ser um atributo imutavel, nao ha necessidade desse metodo
        pois numero sera passado como valor a nova conta via metodo construtor
    */
    /*
    public void setNumero(int numero) {
        if (numero <= 0.0) {
            System.out.println("Error message: Negative value. Try again.");
            return;
        }
        this.numero = numero;
    }
*/

    // methods for saldo.
//    public void depositar(double valor) {
//        this.saldo+=valor;
//    }
    public boolean depositar(double valor) {
        this.saldo+=valor;
        return true;
    }

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

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}

