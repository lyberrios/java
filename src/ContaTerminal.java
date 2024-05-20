import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)
        throws Exception {
        // conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        try {
            //exibir as mensagens para o nosso usuário
            System.out.println("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); //<-- Esta linha consome a nova linha

            //obter pela scanner os valores digitados no terminal
            System.out.println("Por favor, digite o número da agência:");
            String numeroAgencia = scanner.nextLine();

            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da conta:");
            double saldoConta = scanner.nextDouble();

            //exibir a mensagem conta criada
            System.out.println("Conta criada com sucesso! ");
            System.out.println("Dados da conta:");
            System.out.println("Número da conta: " + numeroConta);
            System.out.println("Número da agência: " + numeroAgencia);
            System.out.println("Nome do cliente" + nomeCliente);
            System.out.println("Saldo da conta: " + saldoConta);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você digitou um número inválido. Por favor, tente novamente.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema inesperado. Por favor, tente novamente.");
        } finally {
            //Fechar o scanner
            scanner.close();
        }
    }
}
