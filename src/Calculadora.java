import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int decisao = 0;
        while(decisao != 8){
            System.out.println("\nEscolha o calculo: ");
            System.out.print("1 - Adição;\n2 - Subtração;\n3 - Divisão;\n4 - Multiplicação\n5 - Potência\n6 - Raiz quadrada;\n7 - Porcentagem\n8 - Sair\n-->: ");
            decisao = sc.nextInt();

            if(decisao == 1){
                adicao();
            } else
            if(decisao == 2){
                subtracao();
            }
            else if(decisao == 3){
                divisao();
            }
            else if(decisao == 4){
                multiplicacao();
            }
            else if(decisao == 5){
                potencia();
            }
            else if(decisao == 6){
                raizQuadrada();
            }
            else if(decisao == 7){
                porcentagem();
            };
        }
        System.out.println("Calculadora finalizada!");
    }

    static Scanner sc = new Scanner(System.in);

    private static void porcentagem() {
        System.out.print("PORCENTAGEM\nDigite a porcentagem: ");
        double num1 = sc.nextInt();
        System.out.print(num1 + "% de: ");
        double num2 = sc.nextInt();
        Porcentagem ad = new Porcentagem(num1, num2);
        System.out.println("Resultado: " + ad.getResultado());
    }

    private static void raizQuadrada() {
        System.out.print("RAIZ QUADRADA\nRadicando: ");
        double num1 = sc.nextInt();
        RaizQuadrada ad = new RaizQuadrada(num1);
        System.out.println("Resultado: " + ad.getResultado());
    }

    private static void potencia() {
        System.out.print("POTÊNCIA\nDigite um número: ");
        double num1 = sc.nextInt();
        System.out.print(num1 + " Elevado(^): ");
        double num2 = sc.nextInt();
        Potencia ad = new Potencia(num1, num2);
        System.out.println("Resultado: " + ad.getResultado());
    }

    private static void multiplicacao() {
        System.out.print("Quantos números deseja multiplicar?\n-->: ");
        int qtdNums = sc.nextInt();
        System.out.print("MULTIPLICAÇÃO\nDigite um número: ");
        double num1 = sc.nextInt();
        Multiplicacao ad = new Multiplicacao(num1, 1);
        for(int i = 0; i < qtdNums-1; i++){
            System.out.print(ad.getResultado() + " Vezes(*): ");
            double num2 = sc.nextInt();
            ad.setResultado(ad.getResultado() * num2);
        }

        System.out.println("Resultado: " + ad.getResultado());
    }

    private static void divisao() {
        System.out.print("Quantos números deseja dividir?\n-->: ");
        int qtdNums = sc.nextInt();
        System.out.print("DIVISÃO\nDigite um número: ");
        double num1 = sc.nextInt();
        Divisao ad = new Divisao(num1, 1);
        for(int i = 0; i < qtdNums-1; i++){
            System.out.print(ad.getResultado() + " Dividido por( / ): ");
            double num2 = sc.nextInt();
            ad.setResultado(ad.getResultado() / num2);
        }

        System.out.println("Resultado: " + ad.getResultado());
    }

    private static void subtracao() {
        System.out.print("Quantos números deseja subtrair?\n-->: ");
        int qtdNums = sc.nextInt();
        System.out.print("SUBTRAÇÃO\nDigite um número: ");
        double num1 = sc.nextInt();
        Subtracao ad = new Subtracao(num1, 0);
        for(int i = 0; i < qtdNums-1; i++){
            System.out.print(ad.getResultado() + " Menos(-): ");
            double num2 = sc.nextInt();
            ad.setResultado(ad.getResultado() - num2);
        }

        System.out.println("Resultado: " + ad.getResultado());
    }

    private static void adicao(){
        System.out.print("Quantos números deseja somar?\n-->: ");
        int qtdNums = sc.nextInt();
        System.out.print("ADIÇÃO\nDigite um número: ");
        double num1 = sc.nextInt();
        Adicao ad = new Adicao(num1, 0);
        for(int i = 0; i < qtdNums-1; i++){
            System.out.print(ad.getResultado() + " Mais(+): ");
            double num2 = sc.nextInt();
            ad.setResultado(ad.getResultado() + num2);
        }

        System.out.println("Resultado: " + ad.getResultado());
    }

}
