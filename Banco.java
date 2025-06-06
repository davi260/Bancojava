import java.util.ArrayList;
public class Banco {
    private String nome;
    private String cpf;
    private Float saldo;
    private int numeroConta;
    private ArrayList<Float> extrato = new ArrayList<>();

    void getExtrato() {
        System.out.println("=== EXTRATO ===");
        for (Float operacao : extrato) {
            System.out.printf("R$ %.2f\n", operacao);
        }
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    void setNome(String n) {
        this.nome = n;
    }

    void setCpf(String n) {
        this.cpf = n;
    }

    void setSaldo(Float s) {
        this.saldo = s;
    }

    void setNumeroConta(int n) {
        this.numeroConta = n;
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

