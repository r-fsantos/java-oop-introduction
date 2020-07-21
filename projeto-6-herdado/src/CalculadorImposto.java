public class CalculadorImposto {

    private double valorDosImpostos;

    public void registrarImposto(Tributavel t) {
        this.valorDosImpostos += t.getValorImposto();
    }

    public double getValorDosImpostos() {
        return valorDosImpostos;
    }

}
