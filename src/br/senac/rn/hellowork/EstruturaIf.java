package br.senac.rn.hellowork;

import jdk.internal.dynalink.beans.StaticClass;

public class EstruturaIf {
    public static void main(String[] args){

        double media= 5.4;

        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media < 3) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("RECUPERÇÃO");
        }
    }

}
