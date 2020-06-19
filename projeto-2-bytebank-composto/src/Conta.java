public class Conta {
    // especificacao/ATRIBUTOS do TIPO Conta
    // toda classe do TIPO Conta tem os ATRIBUTOS/propriedades/campos abaixo.
    // construir/INSTANCIAR contas com essa especificacao
    // intanciar -> criar objeto, instância de uma classe de tal TIPO
    //              manipulavel, como se existisse fisicamente
    //              implementacao do meu modelo Conta
    int agencia;
    int conta;
    int numero; // para que mesmo?
    private double saldo;
    Cliente titular;


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

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            /* como atualizar o saldo da conta destino? */
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    // getter - type of method that only acess information
    public double getSaldo() { return this.saldo; }

}

