public class TestaPrimeiroConstrutor {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24456);

        System.out.println(conta.getAgencia());
        conta.setAgencia(123123);

        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2112, 14660);
    }
}