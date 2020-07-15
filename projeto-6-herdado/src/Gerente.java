// gerente originida a partir da heranca de Funcionarios
public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    public double getBonificacao() {
        System.out.println("Obtendo bonificação padrão para Gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
}
