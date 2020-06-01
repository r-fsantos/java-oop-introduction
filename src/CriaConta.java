public class CriaConta {

    public static void main(String[] args) {

        // new Conta(); // instanciamento de uma classe do tipo Conta
        // ateh aqui funciona, mas n faz nada

        Conta primeiraConta = new Conta();
        // entendendo da esquerda pra direita...

        // new Conta(); -> cria espaco na memoria, de acordo com as
        // especificacoes da classe tipo Conta.
        // 4 "espacos", String Titular; int agencia, int conta e
        // double saldo.

        // primeiraConta eh uma variavel que recebe o ponteiro que
        // aponta para a regiao de memoria criada para o objeto
        // primeiraConta

        // Conta eh tipo de primeiraConta. Laranja=Laranja
        // banana != laranja

        primeiraConta.saldo = 200.0;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100.0;
        System.out.println("Primeira conta tem saldo de R$ "+primeiraConta.saldo+" reais");

        // manipulando segundaConta
        Conta segundaConta = new Conta();
        segundaConta.saldo = primeiraConta.saldo;

        System.out.println("Segunda conta tem saldo de R$ "+segundaConta.saldo+" reais");

    }
}
