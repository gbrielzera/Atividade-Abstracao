package br.com.abstracao;

public class ProvaFafifo extends ProvaUniversidade {
    public ProvaFafifo(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean aprovacao() {
        double media = calcularMedia();
        if (media >= 6.0) {
            System.out.println("\nProva Fafifo: " + "\nNota 1: " + getAV1() + "\nNota 2: " + getAV2() + "\nAprovado!\n");
            return true;
        } else {
            System.out.println("\nProva Fafifo: " + "\nNota 1: " + getAV1() + "\nNota 2: " + getAV2() + "\nReprovado!\n");
            return false;
        }
    }
}
