package desafios.desafio_2;

import java.util.Scanner;

public class Palimdromo {
    public static void main(String[] args) {

        String palavra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*********************************\nOlá, seja bem-vindo ao Palimdrômetro!!\n" +
                "Aqui nós iremos verificar se a palavra que você digitou é ou não um Palíndromo..." +
                "\n***palíndromo***\n" +
                "-> adjetivo substantivo masculino\n" +
                "1.diz-se de ou frase ou palavra que se pode ler, indiferentemente, da esquerda para a direita ou vice-versa." +
                "\n*********************************\n");

        System.out.println("Digite a palavra que será verificada: ");
        palavra= scanner.nextLine();

        StringBuilder sb = new StringBuilder(palavra);
        sb.reverse();

        if (palavra.equalsIgnoreCase(String.valueOf(sb))){
            System.out.print("A palavra "+sb+" corresponde a um palíndromo!!");
        }else {
            System.out.print("A palavra "+sb+" infelizmente não é um palíndromo :'( ");
        }


        scanner.close();
    }
}
