public class TestaValores {
    public static void main(String[] args) {
        /*

            Conta contaTestaValores = new Conta();
            contaTestaValores.setAgencia(-50);
            contaTestaValores.setNumero(-330);

        // todavia nao estamos totalmente protegidos contra negative values
        System.out.println(contaTestaValores.getAgencia());

        */
        /*
            valor inconsistente com relacao a regra de negocio da empresa
            output: 0.00

            necessidade de uma inicializacao/instanciamento da classe em objeto (new),
            ja com valores consistentes
         */

        // testando construtor
        Conta contaTestaConstrutor = new Conta(28959, 388580);
        Conta contaTestaConstrutor2 = new Conta(28958, 388581);
        Conta contaTestaConstrutor3 = new Conta(28957, 388582);

        System.out.println("Existem " + Conta.getTotal() + " contas no bytebank-encapsulado");
    }
}
