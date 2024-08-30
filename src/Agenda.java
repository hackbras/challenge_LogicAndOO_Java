import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> pessoas;

    // Construtor
    public Agenda() {
        pessoas = new ArrayList<>(10); // Inicializa o ArrayList com capacidade para 10 pessoas
    }

    // Método para armazenar uma pessoa na agenda
    public void armazenarPessoa(String nome, int idade, float altura) {
        if (pessoas.size() < 10) {
            pessoas.add(new Pessoa(nome, idade, altura));
            System.out.println("Pessoa armazenada com sucesso.");
        } else {
            System.out.println("Agenda cheia! Não é possível armazenar mais pessoas.");
        }
    }

    // Método para remover uma pessoa da agenda pelo nome
    public void removerPessoa(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equalsIgnoreCase(nome)) {
                pessoas.remove(i);
                System.out.println("Pessoa removida com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa não encontrada na agenda.");
    }

    // Método para buscar a posição de uma pessoa na agenda pelo nome
    public int buscarPessoa(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1; // Retorna -1 se a pessoa não for encontrada
    }

    // Método para imprimir os dados de todas as pessoas na agenda
    public void imprimirAgenda() {
        if (pessoas.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            for (int i = 0; i < pessoas.size(); i++) {
                System.out.println("Pessoa " + (i + 1) + ":");
                pessoas.get(i).imprimirPessoa();
                System.out.println();
            }
        }
    }

    // Método para imprimir os dados da pessoa em uma posição específica
    public void imprimirPessoa(int index) {
        if (index >= 0 && index < pessoas.size()) {
            pessoas.get(index).imprimirPessoa();
        } else {
            System.out.println("Posição inválida.");
        }
    }
}