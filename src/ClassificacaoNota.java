import java.util.Scanner;

public class ClassificacaoNota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno (de 0 a 10): ");
        double nota = scanner.nextDouble();


        String classificacao;
        if (nota >= 9) {
            classificacao = "Excelente";
        } else if (nota >= 7) {
            classificacao = "Bom";
        } else if (nota >= 5) {
            classificacao = "Satisfatório";
        } else {
            classificacao = "Insatisfatório";
        }


        System.out.println("Classificação: " + classificacao);


        scanner.close();
    }
}
