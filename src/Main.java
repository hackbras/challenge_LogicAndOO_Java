import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

//        var pes = new Pessoa();
//        pes.setNome("João");
//        pes.setDataNascimento("20/12/1990");
//        pes.setAltura(172);
//
//        //pes.imprimirDados();
//        pes.calcularIdade("1990-12-20");

//         Criando uma bomba de combustível
//        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 6.59, 1000);
//
//        // Testando os métodos
//        bomba.imprimirStatus();
//
//        System.out.println("\nAbastecendo por valor (R$ 50):");
//        bomba.abastecerPorValor(50);
//
//        System.out.println("\nAbastecendo por litros (30 litros):");
//        bomba.abastecerPorLitro(30);
//
//        System.out.println("\nAlterando o valor por litro para R$ 6.79:");
//        bomba.alterarValor(6.79);
//
//        System.out.println("\nAlterando o tipo de combustível para Diesel:");
//        bomba.alterarCombustivel("Diesel");
//
//        System.out.println("\nAlterando a quantidade de combustível na bomba para 800 litros:");
//        bomba.alterarQuantidadeCombustivel(800);
//
//        System.out.println("\nStatus final da bomba:");
//        bomba.imprimirStatus();

//        // Criando um objeto Aluno
//        Aluno aluno = new Aluno("202401", "João Silva", 6.0, 7.0, 5.0);
//
//        // Exibindo as informações do aluno e verificando a necessidade da prova final
//        aluno.imprimirInformacoes();

//        // Criando um objeto Invoice
//        Invoice fatura1 = new Invoice("123", "Teclado Mecânico", 2, 150.00);
//
//        // Exibindo os detalhes da fatura
//        fatura1.imprimirFatura();
//
//        System.out.println("\nModificando a quantidade comprada e o preço unitário:");
//        fatura1.setQuantidadeComprada(3);
//        fatura1.setPrecoUnitario(145.00);
//
//        // Exibindo novamente os detalhes da fatura após a modificação
//        fatura1.imprimirFatura();
//
//        System.out.println("\nTentando definir quantidade negativa e preço negativo:");
//        fatura1.setQuantidadeComprada(-5); // Deve ser ajustado para 0
//        fatura1.setPrecoUnitario(-200.00); // Deve ser ajustado para 0.0
//
//        // Exibindo os detalhes da fatura após tentativa de definir valores inválidos
//        fatura1.imprimirFatura();

        // Criando duas instâncias da classe Funcionario
//        Funcionario funcionario1 = new Funcionario("João", "Silva", 3000.00);
//        Funcionario funcionario2 = new Funcionario("Maria", "Oliveira", 2500.00);
//
//        // Exibindo o salário anual de cada instância
//        System.out.println("Salários anuais iniciais:");
//        funcionario1.imprimirInformacoes();
//        System.out.println();
//        funcionario2.imprimirInformacoes();
//
//        // Dando um aumento de 10% a cada funcionário
//        funcionario1.aplicarAumento(10);
//        funcionario2.aplicarAumento(10);
//
//        // Exibindo novamente o salário anual de cada instância após o aumento
//        System.out.println("\nSalários anuais após aumento de 10%:");
//        funcionario1.imprimirInformacoes();
//        System.out.println();
//        funcionario2.imprimirInformacoes();
        // Criando objetos Data
//        Data data1 = new Data(15, 8, 2024);
//        Data data2 = new Data(1, 1, 2022);
//        Data data3 = new Data(31, 2, 2024); // Data inválida, deve ser ajustada para 01/01/0001
//
//        // Imprimindo as datas
//        System.out.println("Data 1:");
//        data1.imprimirData();
//        System.out.println("Mês por extenso: " + data1.getMesExtenso());
//        System.out.println("Ano bissexto: " + data1.isBissexto());
//        System.out.println();
//
//        System.out.println("Data 2:");
//        data2.imprimirData();
//        System.out.println("Mês por extenso: " + data2.getMesExtenso());
//        System.out.println("Ano bissexto: " + data2.isBissexto());
//        System.out.println();
//
//        System.out.println("Data 3 (inválida, ajustada):");
//        data3.imprimirData();
//        System.out.println();
//
//        // Comparando datas
//        System.out.println("Comparação entre Data 1 e Data 2: " + data1.compara(data2));
//        System.out.println("Comparação entre Data 2 e Data 1: " + data2.compara(data1));
//        System.out.println("Comparação entre Data 1 e Data 1: " + data1.compara(data1));
//
//        // Clonando Data 1
//        Data dataClonada = data1.clone();
//        System.out.println("\nData 1 clonada:");
//        dataClonada.imprimirData();


//        // Criando um objeto Data para a data do voo
//        Data dataVoo = new Data(25, 12, 2024);
//
//        // Criando um objeto Voo
//        Voo voo1 = new Voo(1234, dataVoo);
//
//        // Imprimindo os dados do voo
//        voo1.imprimirDadosVoo();
//
//        // Ocupando algumas cadeiras
//        System.out.println("\nOcupando as cadeiras 1, 50, e 100:");
//        voo1.ocupa(1);
//        voo1.ocupa(50);
//        voo1.ocupa(100);
//
//        // Verificando a ocupação das cadeiras
//        System.out.println("Cadeira 1 está ocupada? " + voo1.verifica(1));
//        System.out.println("Cadeira 2 está ocupada? " + voo1.verifica(2));
//        System.out.println("Cadeira 50 está ocupada? " + voo1.verifica(50));
//        System.out.println("Cadeira 100 está ocupada? " + voo1.verifica(100));
//
//        // Exibindo a próxima cadeira livre
//        System.out.println("\nPróxima cadeira livre: " + voo1.proximoLivre());
//
//        // Exibindo o número de vagas disponíveis após ocupação
//        System.out.println("\nVagas disponíveis após ocupação:");
//        voo1.imprimirDadosVoo();

//        // Criando um objeto Data para a data de nascimento do jogador
//        Data dataNascimento = new Data(10, 6, 1985);
//
//        // Criando um objeto JogadorDeFutebol
//        JogadorDeFutebol jogador = new JogadorDeFutebol("Cristiano Ronaldo", "Atacante", dataNascimento, "Portuguesa", 1.87, 83.0);
//
//        // Imprimindo os dados do jogador
//        jogador.imprimirDados();

//        // Criando uma instância de Ingresso
//        Ingresso ingressoComum = new Ingresso(50.00);
//
//        // Criando uma instância de IngressoVIP
//        IngressoVIP ingressoVIP = new IngressoVIP(50.00, 30.00);
//
//        // Imprimindo o valor dos ingressos
//        System.out.println("Ingresso Comum:");
//        ingressoComum.imprimirValor();
//
//        System.out.println("\nIngresso VIP:");
//        ingressoVIP.imprimirValor();
//
//        // Mostrando a diferença de preços
//        double diferenca = ingressoVIP.getValorVIP() - ingressoComum.getValor();
//        System.out.println("\nDiferença de preço entre Ingresso VIP e Ingresso Comum: R$ " + diferenca);

        Agenda minhaAgenda = new Agenda();

        // Armazenando pessoas na agenda
        minhaAgenda.armazenarPessoa("João", 25, 1.75f);
        minhaAgenda.armazenarPessoa("Maria", 30, 1.65f);
        minhaAgenda.armazenarPessoa("Pedro", 22, 1.80f);

        // Imprimindo a agenda
        System.out.println("Imprimindo toda a agenda:");
        minhaAgenda.imprimirAgenda();

        // Buscando uma pessoa na agenda
        int posicao = minhaAgenda.buscarPessoa("Maria");
        System.out.println("Maria encontrada na posição: " + posicao);

        // Imprimindo os dados de uma pessoa em uma posição específica
        System.out.println("\nImprimindo os dados da pessoa na posição " + posicao + ":");
        minhaAgenda.imprimirPessoa(posicao);

        // Removendo uma pessoa da agenda
        minhaAgenda.removerPessoa("Pedro");

        // Imprimindo a agenda após remoção
        System.out.println("\nImprimindo a agenda após remoção:");
        minhaAgenda.imprimirAgenda();
    }
}