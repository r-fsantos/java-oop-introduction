//contrato Autenticavel
    //quem assinar esse contrato precisa implementar
    //metodo setSenha
    //metodo autentica
public interface Autenticavel {

    void setSenha(int senha);// { this.senha = senha; }
    boolean autenticar(int senha); //{ return this.senha == senha; }

}
