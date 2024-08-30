import java.util.ArrayList;
import java.util.List;

class Compromisso {
    private String tipo;
    private String data;
    private String participante;
    private String telefone;

    // Construtor
    public Compromisso(String tipo, String data, String participante, String telefone) {
        this.tipo = tipo;
        this.data = data;
        this.participante = participante;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para imprimir os dados do compromisso
    public void imprimirCompromisso() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Data: " + data);
        System.out.println("Participante: " + participante);
        System.out.println("Telefone: " + telefone);
    }
}

