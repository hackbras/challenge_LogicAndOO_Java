// Classe Ingresso
public class Ingresso {
    private double valor;

    // Construtor
    public Ingresso(double valor) {
        this.valor = valor;
    }

    // Método para imprimir o valor do ingresso
    public void imprimirValor() {
        System.out.println("Valor do ingresso: R$ " + valor);
    }

    // Getter para o valor do ingresso
    public double getValor() {
        return valor;
    }
}

