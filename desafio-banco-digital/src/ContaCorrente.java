public class ContaCorrente extends Conta{
    
    protected double chequeEspecial = 500;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void sacar(double valor) {
        if(valor <= (saldo + chequeEspecial)){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
        super.imprimirInfosComuns();
    }

    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente === ");
        super.imprimirInfosComuns();
    }
}