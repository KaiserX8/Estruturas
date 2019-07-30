package br.senac.rn.hellowork;

public class EstruturaSwitch {

    public static void main(String[] args) {

        Character letra = 'B';

        switch (letra) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("VOGAL");
                break;
            default:
                System.out.println("NÃO É VOGAL");
        }
    }

}
