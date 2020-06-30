public class TestaContaCorrenteContaPoupanca {

    public static void main(String[] arg) {
        ContaCorrente contaCorrenteDoRenato = new ContaCorrente(1234, 5678);
        ContaPoupanca contaPoupancaDoRenato = new ContaPoupanca(9123, 4567);

        contaCorrenteDoRenato.depositar(100.00);
        contaPoupancaDoRenato.depositar(100.00);

//        contaCorrenteDoRenato.transferir(50.00, contaPoupancaDoRenato);

        System.out.println("Saldo contaCorrenteDoRenato " + contaCorrenteDoRenato.getSaldo());
        System.out.println("Saldo contaPoupancaDoRenato " + contaPoupancaDoRenato.getSaldo());

//         teste @override - devo sacar 10, e observa um desconto adicional de 0,2 centavos
//        contaCorrenteDoRenato.sacar(10.00); // nao funcionou, corrigir a assinatura do metodo
//        System.out.println("Saldo contaCorrenteDoRenato " + contaCorrenteDoRenato.getSaldo());
    }
}
