public abstract class Funcionario {
    public String nome;
    public String cpf;
/*
    protected double salario; // alteracao devido a classe filha referir-se
    a metodo da classe mae atraves de super.getBonificacao() e super.getSalario()
    assim nao eh necessario o protected... private resolve! pois valores de
    atributos sao requisitados via getBonificacao() e getSalario()
 */
    private double salario;

    public Funcionario() {
//        Funcionarios.totalDeFuncionarios ++; // so eh possivel alterar diretamente da classe
    }

    public double getBonificacao() {
        System.out.println("Obtendo bonificação para Funcionário padrão");
        return this.salario * 0.05;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
