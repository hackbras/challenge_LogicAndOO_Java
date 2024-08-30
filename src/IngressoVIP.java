// Classe IngressoVIP que herda de Ingresso
public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    // Construtor
    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    // Método para retornar o valor do ingresso VIP
    public double getValorVIP() {
        return getValor() + valorAdicional;
    }

    // Sobrescrevendo o método imprimirValor para o ingresso VIP
    @Override
    public void imprimirValor() {
        System.out.println("Valor do ingresso VIP: R$ " + getValorVIP());
    }
}
