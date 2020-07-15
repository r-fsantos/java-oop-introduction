public abstract class Autenticavel {
    private int senha;

    public abstract void setSenha(int senha);// { this.senha = senha; }

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

}
