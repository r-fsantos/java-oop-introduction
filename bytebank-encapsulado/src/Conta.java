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
    private Cliente titular;

    // "setters" methods for saldo.
    public void deposita(double valor) {
        this.saldo+=valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta origem, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            /* como atualizar o saldo da conta destino? */
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    // getters - type of method that only acess information
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    // seterrs - type of method that changes variables contents
    public void setNumero(int numero) { // faltando a conta referente a esse numero? e pra multiplas contas?
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

}

