public class Voo {
    private int numeroVoo;
    private Data dataVoo;
    private boolean[] cadeiras;

    // Construtor que inicializa os dados do voo
    public Voo(int numeroVoo, Data dataVoo) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
        this.cadeiras = new boolean[100]; // Inicializa todas as cadeiras como desocupadas (false)
    }

    // ProximoLivre: retorna o número da próxima cadeira livre
    public int proximoLivre() {
        for (int i = 0; i < cadeiras.length; i++) {
            if (!cadeiras[i]) {
                return i + 1; // Retorna a cadeira livre (cadeiras são numeradas de 1 a 100)
            }
        }
        return -1; // Retorna -1 se não houver cadeiras livres
    }

    // Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            throw new IllegalArgumentException("Número da cadeira inválido. Deve estar entre 1 e 100.");
        }
        return cadeiras[numeroCadeira - 1]; // Retorna true se a cadeira estiver ocupada
    }

    // Ocupa: ocupa determinada cadeira do voo, cujo número é recebido como parâmetro
    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            throw new IllegalArgumentException("Número da cadeira inválido. Deve estar entre 1 e 100.");
        }
        if (!cadeiras[numeroCadeira - 1]) {
            cadeiras[numeroCadeira - 1] = true; // Ocupa a cadeira
            return true; // Operação bem sucedida
        }
        return false; // Cadeira já estava ocupada
    }

    // Vagas: retorna o número de cadeiras vagas disponíveis no voo
    public int vagas() {
        int vagasDisponiveis = 0;
        for (boolean cadeira : cadeiras) {
            if (!cadeira) {
                vagasDisponiveis++;
            }
        }
        return vagasDisponiveis;
    }

    // GetVoo: retorna o número do voo
    public int getVoo() {
        return numeroVoo;
    }

    // Método para imprimir os dados do voo
    public void imprimirDadosVoo() {
        System.out.println("Número do Voo: " + numeroVoo);
        System.out.print("Data do Voo: ");
        dataVoo.imprimirData();
        System.out.println("Vagas disponíveis:"+vagas());
    }
}