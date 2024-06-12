public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor padrão
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }

    // Construtor do dia
    public Data(int dia) {
        this();
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido");
        }
    }

    // Construtor com dia e mês
    public Data(int dia, int mes) {
        this(dia);
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    // Construtor com dia, mês e ano
    public Data(int dia, int mes, int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido");
        }
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }
        if (dia >= 1 && dia <= diasNoMes(mes, ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido para o mês fornecido");
        }
    }

    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                return (isAnoBissexto(ano) ? 29 : 28);
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public String formatoCurto() {
        return String.format("%02d/%02d/%02d", dia, mes, ano % 100);
    }

    public String formatoLongo() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String formatoPorExtenso() {
        String[] mesesPorExtenso = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        return String.format("%02d de %s de %04d", dia, mesesPorExtenso[mes - 1], ano);
    }
}
