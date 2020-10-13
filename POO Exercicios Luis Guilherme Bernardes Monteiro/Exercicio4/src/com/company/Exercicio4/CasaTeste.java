package com.company.Exercicio4;

public class CasaTeste {

    public static void main(String[] args) {

        Casa casa1 = new Casa();

        casa1.setPorta1(casa1.portaAberta());
        casa1.setPorta2(casa1.portaAberta());
        casa1.setPorta3(casa1.portaAberta());


        String [] cor = {"Lilas", "Magenta", "Ciano"};
        casa1.pinta(cor [1]);

        System.out.println("a casa foi pintada de " + casa1.getCor());
        casa1.quantasPortasEstaoAbertas();

    }
}
