public abstract interface Autenticavel {

//    private int senha; interface eh um molde, naum possui atributos, pois n eh concreto

    public abstract void setSenha(int senha);// { this.senha = senha; }

    public abstract boolean autenticar(int senha); //{ return this.senha == senha; }

}
