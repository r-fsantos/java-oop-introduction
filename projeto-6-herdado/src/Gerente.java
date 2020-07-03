// gerente originida a partir da heranca de Funcionarios
public class Gerente extends FuncionarioAutenticavel {
    public double getBonificacao() {
        System.out.println("Obtendo bonificação padrão para Gerente");
        return super.getSalario();
    }
}
