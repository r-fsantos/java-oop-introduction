public class Conta {
    // especificacao/ATRIBUTOS do TIPO Conta
    // todo classe do TIPO Conta tem os ATRIBUTOS/propriedades/campos abaixo.
    // construir/INSTANCIAR contas com essa especificacao
    // intanciar -> criar objeto, instância de uma classe de tal TIPO
    //              manipulavel, como se existisse fisicamente
    //              implementacao do meu modelo Conta
    int agencia;
    int conta;
    double saldo;
    Cliente titular;

    // metodos
    public void deposita(double valor) { // public nivel de acesso permitidobom
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

}

