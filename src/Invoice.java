public class Invoice {
    private String numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoUnitario;

    // Construtor que inicializa os atributos
    public Invoice(String numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidadeComprada = quantidadeComprada > 0 ? quantidadeComprada : 0;
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    // Getters e Setters
    public String getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada > 0 ? quantidadeComprada : 0;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    // Método para calcular o valor da fatura
    public double getInvoiceAmount() {
        return quantidadeComprada * precoUnitario;
    }

    // Método para exibir os detalhes da fatura
    public void imprimirFatura() {
        System.out.println("Número do Item: " + numeroItem);
        System.out.println("Descrição do Item: " + descricaoItem);
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Valor Total da Fatura: R$ " + getInvoiceAmount());
    }
}
