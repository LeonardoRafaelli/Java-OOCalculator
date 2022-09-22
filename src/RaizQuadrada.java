public class RaizQuadrada {
    private double radicando;
    private double resultado;

    public RaizQuadrada(double radicando){
        this.radicando = radicando;
        this.resultado = Math.sqrt(radicando);
    }

    public double getResultado() {
        return resultado;
    }

}
