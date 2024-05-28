import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nome_cliente;
        float saldo;
        //TODO: Conhecer e importar a classe scanner
        Scanner tec = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Para criar sua conta precisamos que insira as seguintes informações:");
        System.out.println("Nome do titular: ");
        nome_cliente = tec.nextLine();
        System.out.println("Número da agência: ");
        agencia = tec.nextLine();
        System.out.println("Número da conta: ");
        numero = tec.nextInt();
        System.out.println("Valor do depósito inicial: ");
        saldo = tec.nextFloat();
        //Exibir a mensagem final
        System.out.println("Olá " + nome_cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+numero+ " e seu saldo "+saldo+ " já está disponível para saque");
    }
}
