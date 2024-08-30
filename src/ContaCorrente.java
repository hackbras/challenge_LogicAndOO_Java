public class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    // Construtor - saldo opcional com valor default zero
    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    // Construtor - saldo opcional, mas pode ser inicializado
    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldoInicial;
    }

    // Método para alterar o nome do correntista
    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    // Método para depósito
    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para saque
    public void saque(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado. Verifique o valor do saque e o saldo disponível.");
        }
    }

    // Método para exibir o saldo atual
    public double getSaldo() {
        return this.saldo;
    }

    // Método para exibir as informações da conta
    public void imprimirDados() {
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Nome do Correntista: " + this.nomeCorrentista);
        System.out.println("Saldo: " + this.saldo);
    }
}