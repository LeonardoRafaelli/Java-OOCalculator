public class Porcentagem {
    private double porcentagem;
    private double num;
    private double resultado;

    public Porcentagem(double porcentagem, double num){
        this.resultado = num * (porcentagem / 100);
    }

    public double getResultado() {
        return resultado;
    }
}
