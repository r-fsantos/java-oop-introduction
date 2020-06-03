//package src;
public class TestaMetodo {
    public static void main(String[] args){
        Conta contaDoPaulo = new Conta(); // nomeVariavel==nomeClasse, minusculo

        // atribuindo saldo a uma conta, depositando e imprimindo novo saldo
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println("Saldo R$ "+contaDoPaulo.saldo+" reais");

        // testando metodo saca e imprimindo novo saldo da conta
        boolean conseguiuSacar = contaDoPaulo.saca(50);
        if(conseguiuSacar) {
            System.out.println("Saque efetuado com sucesso.");
        } else {
            System.out.println("Saque não autorizado.\nSaldo insuficiente");
        }
        System.out.println("Saldo R$ " + contaDoPaulo.saldo + " reais");

        // criando nova conta ficticia para testar metodo transfere()
        Conta contaDaMarcela = new Conta(); // new reserva uma parte da memoria vazia = 0.0

        contaDaMarcela.deposita(1000);
        System.out.println("Saldo da conta da Marcela: R$ " + contaDaMarcela.saldo + " reais");

        // verificando saldo da conta do Paulo anterior a transferencia
        System.out.println("Saldo da conta do Paulo: R$ " + contaDoPaulo.saldo + " reais");
        // testando metodo transfere
        //                      (double valor, referencia/
        //                                     endereco
        //                                     da conta destino)
        boolean conseguiuTransferir = contaDaMarcela.transfere(300, contaDoPaulo);
        if(conseguiuTransferir) {
            System.out.println("Transferência efetuada com sucesso.");
        } else {
            System.out.println("Transferencia não autorizada.\nSaldo insuficiente");
        }
        System.out.println("Saldo da conta da Marcela: R$ " + contaDaMarcela.saldo + " reais");

        // verificando saldo da conta do Paulo apos a transferencia
        System.out.println("Saldo da conta do Paulo: R$ " + contaDoPaulo.saldo + " reais");
    }
}
