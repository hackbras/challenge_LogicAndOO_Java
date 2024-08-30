public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            // Data padrão 01/01/0001 se a data fornecida for inválida
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    // Método privado para verificar se a data é válida
    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = { 31, (anoBissexto(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }

    // Método privado para verificar se um ano é bissexto
    private boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Compara a data corrente com outra data
    public int compara(Data outraData) {
        if (this.ano > outraData.getAno()) {
            return 1;
        } else if (this.ano < outraData.getAno()) {
            return -1;
        } else if (this.mes > outraData.getMes()) {
            return 1;
        } else if (this.mes < outraData.getMes()) {
            return -1;
        } else if (this.dia > outraData.getDia()) {
            return 1;
        } else if (this.dia < outraData.getDia()) {
            return -1;
        } else {
            return 0;
        }
    }

    // GetDia: retorna o dia da data
    public int getDia() {
        return this.dia;
    }

    // GetMes: retorna o mês da data
    public int getMes() {
        return this.mes;
    }

    // GetMesExtenso: retorna o mês da data corrente por extenso
    public String getMesExtenso() {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return meses[this.mes - 1];
    }

    // GetAno: retorna o ano da data
    public int getAno() {
        return this.ano;
    }

    // IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto
    public boolean isBissexto() {
        return anoBissexto(this.ano);
    }

    // Clone: o objeto clona a si próprio
    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

    // Método para exibir a data no formato dd/mm/yyyy
    public void imprimirData() {
        System.out.println(String.format("%02d/%02d/%04d", dia, mes, ano));
    }
}
