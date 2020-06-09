public class Conta {
    // especificacao/ATRIBUTOS do TIPO Conta
    // toda classe do TIPO Conta tem os ATRIBUTOS/propriedades/campos abaixo.
    // construir/INSTANCIAR contas com essa especificacao
    // intanciar -> criar objeto, instância de uma classe de tal TIPO
    //              manipulavel, como se existisse fisicamente
    //              implementacao do meu modelo Conta
    //private static int quantidadeDeContas;
    //private
    int agencia;
    //private
    int conta;
    //private
    int numero; // para que mesmo?
    //private
    double saldo;
    //private
    Cliente titular;

    // construtor
    //public Conta(int agencia, int numero) { // rotina de inicializacao -> n eh um metodo
      //  quantidadeDeContas++;
       // System.out.println("O total de contas no banco bytebank é de: " + quantidadeDeContas);
        //this.agencia = agencia;
        //this.numero = numero;
        //System.out.println("Conta sendo criada. N.: " + this.numero);
    //}
    // metodos

    //public int getNumero() {}

  //  public void setNumero(int numero){
    //    if (numero <= 0){
      //      System.out.println("Valor não permitido. Inferior a zero.");
        //    return;
       // }
        //this.numero = numero;
    //}

    //public int getAgencia() {System.out.println("teste getAgencia"); return 0;}

    //public void setAgencia(int agencia) {
      //  if (numero <= 0){
        //    System.out.println("Valor não permitido. Inferior a zero.");
          //  return;
       // }
        //this.agencia = agencia;
    //}

   // public void setTitular(Cliente titular) { }

    //public Cliente getTitular() { }

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

