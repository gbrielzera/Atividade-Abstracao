package br.com.abstracao;

abstract class ProvaUniversidade {
    private double AV1;
    private double AV2;

    public ProvaUniversidade(double AV1, double AV2) {
        this.AV1 = AV1;
        this.AV2 = AV2;
    }

    public double calcularMedia() {
        return (AV1 + AV2) / 2;
    }

    public double getAV1() {
        return AV1;
    }

    public double getAV2() {
        return AV2;
    }
}
