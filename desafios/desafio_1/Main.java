package desafios.desafio_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao programa Calculando Números! \nSou sua inteligência " +
                "artificial e vou calcular tudo para você!! \nApenas digite dois números e " +
                "diga-me qual a operação desejável!! ^-^");

        System.out.println("Primeiro número: ");
        int num1= scanner.nextInt();
        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Selecione a operação matemática: \n1-Somar;" +
                "\n2-Subtrair;\n3-Multiplicar;\n4-Dividir;");
        int opcao = scanner.nextInt();


       Calculadora calculadora = new Calculadora(num1, num2);

        switch (opcao){
            case 1:

                System.out.println("Resultado: "+calculadora.somar(num1, num2));
                break;

            case 2:
                System.out.println("Resultado: "+calculadora.subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: "+calculadora.multiplicar(num1, num2));
                break;
            case 4:
                try{
                    System.out.println("Resultado: "+calculadora.dividir(num1, num2));
                }catch (ArithmeticException e){
                    System.out.print(e.getMessage());
                }
                break;
            default:
                System.out.println("Operação inválida!");

        }
        scanner.close();
    }
}
