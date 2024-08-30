// Classe FuncionarioTeste
public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "Silva", 3000.00);
        Funcionario funcionario2 = new Funcionario("Maria", "Oliveira", 2500.00);

        System.out.println("Salário Anual do Funcionario 1: " + funcionario1.getSalarioAnual());
        System.out.println("Salário Anual do Funcionario 2: " + funcionario2.getSalarioAnual());

        funcionario1.aplicarAumento(10);
        funcionario2.aplicarAumento(10);

        System.out.println("Salário Anual do Funcionario 1 após aumento: " + funcionario1.getSalarioAnual());
        System.out.println("Salário Anual do Funcionario 2 após aumento: " + funcionario2.getSalarioAnual());

        //System.out.println("Número de Funcionários: " + Funcionario.getContadorFuncionarios());
    }
}