public class TestaNewTransferir {

    public static void main(String[] args) {
        Conta renato = new Conta(1234, 5678);
        Conta felicio = new Conta(01234, 04567);

        System.out.println("Renato saldo: " + renato.getSaldo());
        System.out.println("Felicio saldo: " + felicio.getSaldo());

        System.out.println(renato.transferir(50, felicio));

        System.out.println("Renato saldo: " + renato.getSaldo());
        System.out.println("Felicio saldo: " + felicio.getSaldo());
    }
}
