import java.util.Scanner;

public class ClassificacaoTemperatura {
    public static void main(String[] args) {
        // Passo 1: Peça ao usuário para inserir uma temperatura em graus Celsius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();

        // Passo 2: Classifique a temperatura
        String classificacao;
        if (temperatura > 30) {
            classificacao = "Quente";
        } else if (temperatura >= 15 && temperatura <= 30) {
            classificacao = "Agradável";
        } else {
            classificacao = "Frio";
        }

        // Passo 3: Imprima a classificação correspondente
        System.out.println("Classificação: " + classificacao);

        // Fechar o scanner
        scanner.close();
    }
}
