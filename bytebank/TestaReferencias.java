public class TestaReferencias {
    public static void main(String[] args){

	Conta primeiraConta=new Conta();
	primeiraConta.saldo=300.00;
	Conta segundaConta = primeiraConta;
	segundaConta.saldo+=100.00;

	if(primeiraConta==segundaConta)
	    System.out.println("mesma conta");
	
	System.out.println("Primeira Conta\nSaldo: R$ "+primeiraConta.saldo+" Reais");
	
    }
}
