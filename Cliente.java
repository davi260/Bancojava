public class Cliente extends Banco {
    private String nome;
    private String cpf;
    private Banco conta; // Ligação com a classe Conta (ou ContaCorrente, ContaPoupanca)

    // Construtor
    public Cliente(String nome, String cpf, Banco conta) {
        super(conta.numeroConta);
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Banco getConta() {
        return conta;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setConta(Banco conta) {
        this.conta = conta;
    }

    // Método utilitário opcional
    public void mostrarDados() {
        System.out.println("===== DADOS DO CLIENTE =====");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());
    }
}