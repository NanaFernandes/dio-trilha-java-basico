import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    //getters
    public String getNome(){
        return this.nome;
    }

    //setters
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}
