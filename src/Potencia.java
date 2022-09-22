public class Potencia {
    private double num1, num2;
    private double resultado;

    public Potencia(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = calcularPotencia(num1, num2);
    }

    public double calcularPotencia(double num1, double num2){
        for(int i = 0; i < num2-1; i++){
            num1 *= num2;
        }
        return num1;
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
}
