import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("Bem-vindo(a) ao NanaBank");
        System.out.println("============================");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");

    }

    public static void main(String[] args){
        String nomeCliente;
        int contaTipo;
        Conta co = null;
        double valor;
        Scanner tec = new Scanner(System.in);
        int op;
        do{
            menu();
            op = tec.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Nome:");
                    nomeCliente = tec.next();
                    Cliente c = new Cliente(nomeCliente);
                    System.out.println("Crie uma conta para o cliente cadastrado: ");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupanca");
                    contaTipo = tec.nextInt();
                    if(contaTipo == 1){
                        co= new ContaCorrente(c);
                    } else {
                        co = new ContaPoupanca(c);
                    }
                    break;
            
                case 2:
                    System.out.println("Quanto deseja sacar?");
                    valor = tec.nextDouble();
                    Optional<Conta> optionalValueS = Optional.of(co);
                    optionalValueS.get().sacar(valor);
                    break;
                case 3:
                    System.out.println("Quanto deseja Depositar?");
                    valor = tec.nextDouble();
                    Optional<Conta> optionalValueD = Optional.of(co);
                    optionalValueD.get().depositar(valor);
                    break;
                default:
                    break;
            }

        }while(op != 0);
    }
    
}
