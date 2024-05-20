import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)
        {
        // conhecer e importar a classe scanner
        try (Scanner scanner = new Scanner(System.in)){


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
            String mensagem = String.format(
                    "Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f já está disponível para saque",
                    nomeCliente, numeroAgencia, numeroConta, saldoConta
            );
            System.out.println(mensagem);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você digitou um número inválido. Por favor, tente novamente.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema inesperado. Por favor, tente novamente.");
        }
        }
    }