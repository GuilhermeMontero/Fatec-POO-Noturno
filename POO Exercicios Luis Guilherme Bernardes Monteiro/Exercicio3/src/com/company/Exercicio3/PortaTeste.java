package com.company.Exercicio3;

public class PortaTeste {

    public static void main(String[] args) {
        Porta porta1 = new Porta(true, "Laranja", 50,2.10f,3);

        porta1.imprimi();
        porta1.aberta();
        porta1.fecha();
        porta1.abre();
        porta1.pinta("Roxo");
    }
}
