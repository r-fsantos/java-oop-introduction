public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.nome = "Renato Felício";
        conta.titular = cliente;

        // testa associacao entre objetos -> 1 cliente <-> 1 conta
        System.out.println(conta.titular.nome + "\n");

        System.out.println("Saldo da conta é R$ " + conta.getSaldo() + " Reais");
        conta.deposita(100);
        System.out.println("Saldo da conta é R$ " + conta.getSaldo() + " Reais");

        System.out.println("");

        if(!conta.saca(100)) {
            System.out.println("Saque não permitido. Saldo incompatível ao valor." +
                               "\nSeu saldo atualizado: R$ " + conta.getSaldo() + " Reais.");
        } else {
            System.out.println("Saque realizado com sucesso." +
                               "\nSeu saldo atualizado: R$ " + conta.getSaldo() + " Reais.");
        }
    }
}
