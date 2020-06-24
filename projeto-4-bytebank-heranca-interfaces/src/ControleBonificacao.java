public class ControleBonificacao {
    private double soma;

    /* REFATORANDO
         total de bonificacoes pagas a funcionarios da empresa
         codigo verboso, com metodos que fazem a mesma coisa...
         valendo-se da heranca, aplicamos o polimorfismo para simplificar
     */
    /*
    public void registrarTotalDeBonificacoes(EditorDeVideo ev) {
        this.soma += ev.getBonificacao();
    }
    public void registrarTotalDeBonificacoes(Gerente g) {
      this.soma += g.getBonificacao();
    }
     */

    public void registrarTotalDeBonificacoes(Funcionario f) {
        this.soma += f.getBonificacao();
    }

    // somatorio de bonificacoes a serem pagas aos funcionarios da empresa
    public double getSoma() {
        return this.soma;
    }
}
