
// Classe CompromissosTeste
public class CompromissosTeste {
    public static void main(String[] args) {
        AgendaCompromissos agenda = new AgendaCompromissos();

        // Agendando compromissos
        agenda.agendarCompromisso("Reunião", "20/08/2024", "Empresa X", "1234-5678");
        agenda.agendarCompromisso("Pagamento", "21/08/2024", "Pessoa Y", "9876-5432");

        // Exibindo compromissos por participante
        System.out.println("Compromissos para Empresa X:");
        agenda.exibirCompromissosPorParticipante("Empresa X");

        // Exibindo compromissos por data
        System.out.println("Compromissos para a data 21/08/2024:");
        agenda.exibirCompromissosPorData("21/08/2024");

        // Alterando um compromisso
        agenda.alterarCompromisso("Empresa X", "20/08/2024", "Entrega de Projeto", "1122-3344");

        // Exibindo compromissos alterados
        System.out.println("Compromissos alterados para Empresa X:");
        agenda.exibirCompromissosPorParticipante("Empresa X");

        // Removendo um compromisso
        agenda.removerCompromisso("Pessoa Y", "21/08/2024");

        // Exibindo compromissos após remoção
        System.out.println("Compromissos após remoção para Pessoa Y:");
        agenda.exibirCompromissosPorParticipante("Pessoa Y");
    }
}