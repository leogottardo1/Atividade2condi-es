import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: R$ ");
        double valorOriginal = scanner.nextDouble();


        double percentualDesconto = 0;
        double valorDescontado;
        double valorFinal;


        if (valorOriginal > 500) {
            percentualDesconto = 20;
        } else if (valorOriginal >= 200) {
            percentualDesconto = 10;
        } else if (valorOriginal >= 100) {
            percentualDesconto = 5;
        } else {
            percentualDesconto = 0;
        }

        valorDescontado = valorOriginal * (percentualDesconto / 100);
        valorFinal = valorOriginal - valorDescontado;


        System.out.println("Valor Original: R$ " + String.format("%.2f", valorOriginal));
        System.out.println("Percentual de Desconto: " + percentualDesconto + "%");
        System.out.println("Valor Descontado: R$ " + String.format("%.2f", valorDescontado));
        System.out.println("Valor Final: R$ " + String.format("%.2f", valorFinal));


        scanner.close();
    }
}
