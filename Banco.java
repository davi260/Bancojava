import java.util.ArrayList;
public class Banco {
    String nome;
    String cpf;
    Float saldo;
    int numeroConta;
    ArrayList<Float> extrato = new ArrayList<>();

    void mostrarExtrato() {
        System.out.println("=== EXTRATO ===");
        for (Float operacao : extrato) {
            System.out.printf("R$ %.2f\n", operacao);
        }
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    void deposito(float valorDeposito){
        if (valorDeposito > 0){
            saldo += valorDeposito;
            extrato.add(+valorDeposito);
            System.out.printf("Valor de depósito %f\n Saldo: %f\n", valorDeposito,saldo);
        }
        else{
            System.out.printf("Valor de depósito Inválido %f\n", valorDeposito);
        }

    }

    void saque(float valorSaque){
        saldo -= valorSaque;
        extrato.add(-valorSaque);
    }
}

