public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        conta.deposita(100);
//        System.out.println("saldo da conta R$ " + conta.saldo + " Reais.");
        System.out.println("saldo da conta R$ " + conta.getSaldo() + " Reais.");

        // utilizar retorno do metodo (boolean)
//        conta.saca(200); // valor > saldo
        System.out.println(conta.saca(200)); /* retorna falso */
//        System.out.println("saldo da conta R$ " + conta.saldo + " Reais.");
        System.out.println("saldo da conta R$ " + conta.getSaldo() + " Reais.");

        // truque -> acessar saldo diretamente
        // acessar tributo diretamente! imagina a confusao...
        // design pattern
        //conta.saldo -= 200;
        System.out.println("saldo da conta R$ " + conta.getSaldo() + " Reais.");
    }
}
