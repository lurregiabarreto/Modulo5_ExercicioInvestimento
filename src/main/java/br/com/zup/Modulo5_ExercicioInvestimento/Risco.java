package br.com.zup.Modulo5_ExercicioInvestimento;

public enum Risco {
    ALTO(2.5), MEDIO(0.0015), BAIXO(0.0005);
    private double taxaRetorno;

    Risco(double taxaRetorno) {
        this.taxaRetorno = taxaRetorno;
    }

    public double getTaxaRetorno() {
        return taxaRetorno;
    }

}
