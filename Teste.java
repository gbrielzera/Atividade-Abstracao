package br.com.abstracao;

public class Teste {
    public static void main(String args[]) {

        ProvaUCB P1 = new ProvaUCB(10, 10);
        ProvaFafifo P2 = new ProvaFafifo(5,5);

        P1.aprovacao();
        P2.aprovacao();
    }
}
