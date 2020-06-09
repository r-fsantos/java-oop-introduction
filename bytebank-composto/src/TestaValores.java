public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta();

        // testando valores negativos
        conta.setAgencia(-50);
        conta.setNumero(-550);
        System.out.println(conta.getAgencia());
    }
}