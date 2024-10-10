package br.com.abstracao;

public class ProvaUCB extends ProvaUniversidade {
    public ProvaUCB(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean aprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Prova UCB:" + "\nNota 1: " + getAV1() + "\nNota 2: " + getAV2() + "\nAprovado!\n");
            return true;
        } else {
            System.out.println("Prova UCB: " + "\nNota 1: " + getAV1() + "\nNota 2: " + getAV2() + "\nReprovado!\n");
            return false;
        }
    }
}
