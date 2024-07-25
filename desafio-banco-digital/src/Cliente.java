public class Cliente {
    
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    //getters
    public String getNome(){
        return this.nome;
    }

    //setters
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}
