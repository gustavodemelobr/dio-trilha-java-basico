package edu.gustavo.segundasemana;

public class BoletimEstudantil {

// arquivo BoletimEstudantil.java

    public static void main(String[] args) {
        int mediaFinal = 9;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    System.out.println("Obrigado por utilizar este aplicativo.");
    }
}
