// gerente originida a partir da heranca de Funcionarios
public class Gerente extends Funcionario {
    private int senha;

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
//        return this.salario;
//        trocar this por super -> atributo referente a superclasse Funcionario
//        return super.salario;
//        return this.salario * 0.1;
//        return (super.salario * 0.1) + super.salario;
//        return super.salario * 1.1;
//        mantendo a assinatura
        System.out.println("Obtendo bonificação padrão para Gerente");
        return super.getBonificacao() + super.getSalario();
    }
}
