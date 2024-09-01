import java.util.Scanner;

public class VerificacaoAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        /
        String resultado;
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }


        System.out.println("Resultado: " + resultado);


        scanner.close();
    }
}
