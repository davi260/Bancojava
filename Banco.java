import java.util.ArrayList;
public class Banco {

    protected double saldo;
    protected int numeroConta;
    protected ArrayList<Float> extrato = new ArrayList<>();


    public Banco(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    void getExtrato() {
        System.out.println("=== EXTRATO ===");
        for (Float operacao : extrato) {
            System.out.printf("R$ %.2f\n", operacao);
        }
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
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
    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}

