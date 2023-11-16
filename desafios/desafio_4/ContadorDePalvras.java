package desafios.desafio_4;

import java.util.Scanner;

public class ContadorDePalvras {
    public static void main(String[] args) {

        String texto;
        int numPalavras=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n***********\nBem-vindo(a) ao Contador de Palavras Java!!\n" +
                "Neste programa, você irá inserir o texto via teclado e, em seguida, lhe direi quantas palavras ele" +
                " possui!!\nVamos tentar!!\n***********\nDigite o texto aqui: ");
        texto = scanner.nextLine();

        String[]arrayTexto = texto.split("\\s+");
        numPalavras= arrayTexto.length;

         System.out.print(numPalavras);
    }
}
