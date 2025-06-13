import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Criar a conta (Banco)
        System.out.print("Digite o número da conta: ");
        int numeroConta = input.nextInt();
        input.nextLine();  // limpar buffer
        Banco conta = new Banco(numeroConta);

        // 2. Criar o cliente e associar a conta
        System.out.print("Digite o nome do cliente: ");
        String nome = input.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpf = input.nextLine();

        Cliente cliente = new Cliente(nome, cpf, conta);

        // 3. Operações: mostrar dados, depositar, sacar, extrato
        boolean rodando = true;
        while (rodando) {
            System.out.println("""
               ################################
               # Escolha a operação:          #
               # 1 - Mostrar dados do cliente #
               # 2 - Depositar                #  
               # 3 - Sacar                    #
               # 4 - Ver extrato              #
               # 5 - Sair                     #
               ################################
                """);

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    cliente.mostrarDados();
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    float valorDep = input.nextFloat();
                    conta.deposito(valorDep);
                    break;
                case 3:
                    System.out.print("Valor para saque: ");
                    float valorSaq = input.nextFloat();
                    conta.saque(valorSaq);
                    break;
                case 4:
                    conta.getExtrato();
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        input.close();
    }
}