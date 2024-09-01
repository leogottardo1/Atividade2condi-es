import java.util.Scanner;

public class CalculoSalarioComBonificacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();


        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalho = scanner.nextInt();


        double bonus = 0;
        double percentualImposto = 0;


        if (anosTrabalho > 10) {
            bonus = salarioBruto * 0.10;
        } else if (anosTrabalho >= 5) {
            bonus = salarioBruto * 0.05;
        } else {
            bonus = 0;
        }


        if (salarioBruto > 5000) {
            percentualImposto = 27;
        } else if (salarioBruto >= 3000) {
            percentualImposto = 18;
        } else {
            percentualImposto = 10;
        }


        double impostoDescontado = salarioBruto * (percentualImposto / 100);
        double salarioLiquido = salarioBruto + bonus - impostoDescontado;


        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Bônus Recebido: R$ " + String.format("%.2f", bonus));
        System.out.println("Imposto Descontado: R$ " + String.format("%.2f", impostoDescontado));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));


        scanner.close();
    }
}
