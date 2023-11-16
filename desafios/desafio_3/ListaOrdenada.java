package desafios.desafio_3;

import java.util.*;

public class ListaOrdenada {
    public static void main(String[] args) {

        List<Integer>  lista_numerica = new ArrayList<>();
        int numero=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------\nOlá seja bem-vindo(a)!!!" +
                "\nEste programa Java irá funcionar como uma lista numérica e VOCÊ decidirá como ordena-la." +
                "\n*Obs: digite apenas números inteiros .*" +
                "\n-----------------------------------\n");

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        lista_numerica.add(numero);

        do {
            System.out.println("Adicione outro número ou digite 0 para sair  ");

                numero = scanner.nextInt();
                lista_numerica.add(numero);

        }while (numero!=0);

        lista_numerica.remove(lista_numerica.lastIndexOf(numero));

        System.out.print("\n->De qual maneira você pretende ordenar:\n" +
                "1- Ordem crescente;\n" +
                "2- Ordem decrescente;");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                Collections.sort(lista_numerica);
                System.out.println("\n->Lista em ordem cresccente: "+lista_numerica);
                break;
            case 2:
                Collections.sort(lista_numerica, Collections.reverseOrder());
                System.out.println("\n->Lista em ordem decrescente: "+lista_numerica);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        scanner.close();

    }
}
