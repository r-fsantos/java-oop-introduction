public class EditorDeVideo extends Funcionario{

    // recebe bonificacao padrao de funcionario + acrescimo
    // referencia a superClass Funcionario
    public double getBonificacao() {
        System.out.println("Obtendo bonificação padrão para Editor de Vídeo");
        return super.getBonificacao() + 100.00;
    }
}
