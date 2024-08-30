// Classe FaturaTeste
public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "Teclado Mecânico", 2, 150.0);

        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidadeComprada());
        System.out.println("Preço por item: " + fatura.getPrecoPorItem());
        System.out.println("Total da Fatura: " + fatura.getTotalFatura());
    }
}