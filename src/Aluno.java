public class Aluno {
    private String matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    // Construtor
    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    // Método para calcular a média final
    public double media() {
        double mediaFinal = ((notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2)) / 7;
        return mediaFinal;
    }

    // Método para calcular a nota necessária na prova final
    public double notaParaFinal() {
        double mediaFinal = media();
        if (mediaFinal >= 7.0) {
            return 0.0; // Aluno não precisa fazer prova final
        } else {
            // Nota necessária para alcançar média 7.0
            double notaNecessaria = (7.0 * 7 - (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2)) / 2.5;
            return notaNecessaria > 10 ? 10 : notaNecessaria; // Nota máxima na final é 10
        }
    }

    // Métodos para exibir as informações do aluno
    public void imprimirInformacoes() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota Prova 1: " + notaProva1);
        System.out.println("Nota Prova 2: " + notaProva2);
        System.out.println("Nota Trabalho: " + notaTrabalho);
        System.out.println("Média Final: " + media());
        double notaFinal = notaParaFinal();
        if (notaFinal == 0.0) {
            System.out.println("O aluno não precisa fazer a prova final.");
        } else {
            System.out.println("O aluno precisa de " + notaFinal + " na prova final.");
        }
    }
}
