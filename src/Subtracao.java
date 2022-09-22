public class Subtracao {
    private double num1, num2;
    private double resultado;

    public Subtracao(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = num1 - num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
