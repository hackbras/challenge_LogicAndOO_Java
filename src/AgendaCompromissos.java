import java.util.ArrayList;
import java.util.List;

public class AgendaCompromissos {
    private List<Compromisso> compromissos;

    // Construtor
    public AgendaCompromissos() {
        compromissos = new ArrayList<>();
    }

    // Método para agendar um compromisso
    public void agendarCompromisso(String tipo, String data, String participante, String telefone) {
        compromissos.add(new Compromisso(tipo, data, participante, telefone));
        System.out.println("Compromisso agendado com sucesso.");
    }

    // Método para remover um compromisso
    public void removerCompromisso(String participante, String data) {
        compromissos.removeIf(c -> c.getParticipante().equalsIgnoreCase(participante) && c.getData().equals(data));
        System.out.println("Compromisso removido com sucesso.");
    }

    // Método para alterar um compromisso
    public void alterarCompromisso(String participante, String data, String novoTipo, String novoTelefone) {
        for (Compromisso c : compromissos) {
            if (c.getParticipante().equalsIgnoreCase(participante) && c.getData().equals(data)) {
                c.setTipo(novoTipo);
                c.setTelefone(novoTelefone);
                System.out.println("Compromisso alterado com sucesso.");
                return;
            }
        }
        System.out.println("Compromisso não encontrado.");
    }

    // Método para exibir compromissos por participante
    public void exibirCompromissosPorParticipante(String participante) {
        for (Compromisso c : compromissos) {
            if (c.getParticipante().equalsIgnoreCase(participante)) {
                c.imprimirCompromisso();
                System.out.println();
            }
        }
    }

    // Método para exibir compromissos por data
    public void exibirCompromissosPorData(String data) {
        for (Compromisso c : compromissos) {
            if (c.getData().equals(data)) {
                c.imprimirCompromisso();
                System.out.println();
            }
        }
    }
}
