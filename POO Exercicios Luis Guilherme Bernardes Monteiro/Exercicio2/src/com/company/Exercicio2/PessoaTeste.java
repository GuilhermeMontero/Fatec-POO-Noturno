package com.company.Exercicio2;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Guilherme");
        pessoa.setIdade(27);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("idade: " + pessoa.getIdade());
        pessoa.proximaIdade(5);
    }
}
