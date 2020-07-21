public class TestaClassesTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registrarImposto(cc);
        calc.registrarImposto(seguro);

        System.out.println(calc.getValorDosImpostos());
    }
}
