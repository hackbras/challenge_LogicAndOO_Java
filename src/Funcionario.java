public class Funcionario {
    private static int contadorFuncionarios = 0;
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor que inicializa os três atributos
    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0.0;
        contadorFuncionarios++;
    }
    // Getters e Setters
    public String getPrimeiroNome() {
        return nome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.nome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0.0;
    }

    // Método para calcular o salário anual
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    // Método para aplicar um aumento de 10%
    public void aplicarAumento(double percentual) {
        salarioMensal += salarioMensal * (percentual / 100);
    }

    // Método para exibir as informações do funcionário
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Salário Mensal: R$ " + salarioMensal);
        System.out.println("Salário Anual: R$ " + getSalarioAnual());
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método que retorna o número de funcionários
    public static int getContadorFuncionarios() {
        return contadorFuncionarios;
    }
}
