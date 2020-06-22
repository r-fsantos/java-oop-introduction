import java.util.zip.CheckedOutputStream;

public class Conta {
    // especificacao/ATRIBUTOS do TIPO Conta
    // toda classe do TIPO Conta tem os ATRIBUTOS/propriedades/campos abaixo.
    // construir/INSTANCIAR contas com essa especificacao
    // intanciar -> criar objeto, instância de uma classe de tal TIPO
    //              manipulavel, como se existisse fisicamente
    //              implementacao do meu modelo Conta
    private int agencia;
    private int numero; // numero da conta
    private double saldo;
    private static int total;
//    private int total;
    private Cliente titular;

    // constructor method --> initialization routine
    public Conta(int agencia, int numero) {
       Conta.total ++; // atributo de classe
//        total ++;
//        System.out.println("o total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
//        System.out.println("Estou criando uma conta " + this.numero);
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
    public void setAgencia(int agencia) {
        if (agencia <= 0.0) {
            System.out.println("Error message: Negative value. Try again.");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    /*
        em caso de agencia ser um atributo imutavel, nao ha necessidade desse metodo
        a agencia sera passada como valor a nova conta via metodo construtor
    */
    public void setNumero(int numero) {
        if (numero <= 0.0) {
            System.out.println("Error message: Negative value. Try again.");
            return;
        }
        this.numero = numero;
    }

    // methods for saldo.
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta origem, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            /* como atualizar o saldo da conta destino? */
            destino.depositar(valor);
            return true;
        } else {
            return false;
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

