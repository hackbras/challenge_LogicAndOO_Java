public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    // Método inicializa: recebe a capacidade e o total de andares no prédio
    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // Elevador começa no térreo
        this.pessoasPresentes = 0; // Elevador começa vazio
    }

    // Método para acrescentar uma pessoa no elevador
    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador. Pessoas presentes: " + pessoasPresentes);
        } else {
            System.out.println("Elevador cheio! Não é possível entrar mais pessoas.");
        }
    }

    // Método para remover uma pessoa do elevador
    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador. Pessoas presentes: " + pessoasPresentes);
        } else {
            System.out.println("O elevador está vazio! Não há ninguém para sair.");
        }
    }

    // Método para subir um andar
    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar: " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar.");
        }
    }

    // Método para descer um andar
    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar: " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }

    // Método para exibir o status atual do elevador
    public void imprimirStatus() {
        System.out.println("Andar Atual: " + andarAtual);
        System.out.println("Total de Andares: " + totalAndares);
        System.out.println("Capacidade do Elevador: " + capacidade);
        System.out.println("Pessoas Presentes: " + pessoasPresentes);
    }
}
