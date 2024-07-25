public abstract class Conta implements IConta {
    // Interessante que esta classe seja abstrata, pois não faz sentido instanciar
    // uma Conta, não sendo ela corrente ou poupança

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if(valor <= saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
        this.imprimirInfosComuns();
    }

    public void depositar(double valor) {
        this.saldo += valor;
        this.imprimirExtrato();
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    //getters
    public int getAgencia(){
        return this.agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }

    //setters
    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
 
    
}
