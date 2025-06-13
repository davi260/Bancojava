
public class ContaCorrente extends Banco {
    public ContaCorrente(int numeroConta) {
        super(numeroConta);
    }

    @Override
    public void saque(float valor) {
        float taxa = 2.5f;
        if (valor + taxa <= saldo) {
            saldo -= (valor + taxa);
            extrato.add(-valor);
            extrato.add(-taxa);
            System.out.printf("Saque de R$ %.2f com taxa de R$ %.2f\n", valor, taxa);
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }
}
