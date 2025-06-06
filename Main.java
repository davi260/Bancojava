import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco minhaConta = new Banco();

        System.out.println("Digite seu nome: ");
        minhaConta.nome = input.nextLine();

        System.out.println("Digite seu cpf: ");
        minhaConta.cpf = input.nextLine();

        System.out.println("Digite sua conta: ");
        minhaConta.numeroConta = input.nextInt();

        minhaConta.saldo = 1000.002f;


        int operacao = 0;
        while(true){
            System.out.println("""
            *********************************
            *                               *
            *   DIGITE A OPERAÇÃO DESEJADA  *
            *   1 - CONSULTAR O EXTRATO     *
            *   2 - DEPOSITAR NA CONTA      *
            *   3 - SACAR DA CONTA          *
            *   4 - SAIR                    *
            *                               *
            ********************************* 
            """);
            operacao = input.nextInt();
            switch (operacao) {
                case 1:
                    minhaConta.mostrarExtrato();
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    float valorDep = input.nextFloat();
                    minhaConta.deposito(valorDep);
                    break;
                case 3:
                    System.out.print("Valor para saque: ");
                    float valorSaq = input.nextFloat();
                    minhaConta.saque(valorSaq);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            if(operacao == 4){
                break;
            }
        }
        }
    }
