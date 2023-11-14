package desafios.desafio_1;

public class Calculadora {
    int num1;
    int num2;

    public Calculadora(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    int somar(int num1, int num2){
        return num1 + num2;
    }

    int subtrair(int num1, int num2){
        return num1 - num2;
    }

    int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    int dividir(int num1, int num2){
        if(num2==0){
            throw new ArithmeticException("Não consigo divir por zero!\nTente outro número!!");
        }else {
            return num1 / num2;
        }
    }
}
