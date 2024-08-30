public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivel;

    // Construtor
    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    // Método para abastecer por valor
    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorPorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Abastecido " + litrosAbastecidos + " litros de " + tipoCombustivel + ".");
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    // Método para abastecer por litros
    public void abastecerPorLitro(double litros) {
        double valorAPagar = litros * valorPorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Valor a ser pago: R$ " + valorAPagar);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    // Método para alterar o valor por litro
    public void alterarValor(double novoValorPorLitro) {
        this.valorPorLitro = novoValorPorLitro;
        System.out.println("Novo valor por litro: R$ " + novoValorPorLitro);
    }

    // Método para alterar o tipo de combustível
    public void alterarCombustivel(String novoTipoCombustivel) {
        this.tipoCombustivel = novoTipoCombustivel;
        System.out.println("Novo tipo de combustível: " + novoTipoCombustivel);
    }

    // Método para alterar a quantidade de combustível na bomba
    public void alterarQuantidadeCombustivel(double novaQuantidadeCombustivel) {
        this.quantidadeCombustivel = novaQuantidadeCombustivel;
        System.out.println("Nova quantidade de combustível na bomba: " + novaQuantidadeCombustivel + " litros.");
    }

    // Método para exibir o status atual da bomba
    public void imprimirStatus() {
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Valor por Litro: R$ " + valorPorLitro);
        System.out.println("Quantidade de Combustível na Bomba: " + quantidadeCombustivel + " litros.");
    }
}

