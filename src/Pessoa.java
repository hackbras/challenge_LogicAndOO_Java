import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private float idade;
    private float altura;

    // Construtor
    public Pessoa(String nome, float idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters e Setters
    public String getNome(){ return this.nome;}

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getDataNascimento(){return this.dataDeNascimento;}

    public void setDataNascimento(String dataDeNascimento){this.dataDeNascimento=dataDeNascimento;}

    public float getAltura(){return altura;}

    public void setAltura(int altura){this.altura=altura;}

    // Método para imprimir os dados da pessoa
    public void imprimirPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.altura + " metros");
    }
    public void calcularIdade(String dataNascimento){

        // Data de nascimento no formato ano-mês-dia
        String dataNascimentoStr = "1990-08-19";;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataNasc = LocalDate.parse(dataNascimentoStr, formatter);

        // Data atual
        LocalDate dataAtual = LocalDate.now();

        // Calcular a idade
        int idade = Period.between(dataNasc, dataAtual).getYears();

        System.out.println("A idade é: " + idade + " anos");
    }

}
