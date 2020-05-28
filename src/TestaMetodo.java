//package src;
public class TestaMetodo {
    public static void main(String[] args){
        Conta contaDoPaulo = new Conta(); // nomeVariavel==nomeClasse, minusculo

        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println("Saldo R$ "+contaDoPaulo.saldo+" reais");
    }
}
