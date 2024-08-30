public class JogadorDeFutebol {
    private String nome;
    private String posicao;
    private Data dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    // Construtor
    public JogadorDeFutebol(String nome, String posicao, Data dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para imprimir todos os dados do jogador
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.print("Data de Nascimento: ");
        dataNascimento.imprimirData();
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("Anos restantes para aposentadoria: " + calcularAnosParaAposentadoria() + " anos");
    }

    // Método para calcular a idade do jogador
    public int calcularIdade() {
        Data dataAtual = new Data(19, 8, 2024); // Simulando data atual, ajuste conforme necessário
        int idade = dataAtual.getAno() - dataNascimento.getAno();
        if (dataAtual.getMes() < dataNascimento.getMes() ||
                (dataAtual.getMes() == dataNascimento.getMes() && dataAtual.getDia() < dataNascimento.getDia())) {
            idade--;
        }
        return idade;
    }

    // Método para calcular anos restantes para aposentadoria
    public int calcularAnosParaAposentadoria() {
        int idade = calcularIdade();
        int idadeAposentadoria = 0;

        switch (posicao.toLowerCase()) {
            case "defesa":
                idadeAposentadoria = 40;
                break;
            case "meio-campo":
            case "meio campo":
                idadeAposentadoria = 38;
                break;
            case "atacante":
                idadeAposentadoria = 35;
                break;
            default:
                idadeAposentadoria = 38; // Padrão para posições indefinidas
                break;
        }

        int anosRestantes = idadeAposentadoria - idade;
        return anosRestantes > 0 ? anosRestantes : 0; // Retorna 0 se já estiver na idade de aposentadoria ou acima
    }
}
