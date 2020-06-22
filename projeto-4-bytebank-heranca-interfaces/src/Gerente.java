// gerente originida a partir da heranca de Funcionarios
public class Gerente extends Funcionarios {
    private int senha;

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    /*

    public double getBonificacao() {
        return this.salario;
    }

     */
}
