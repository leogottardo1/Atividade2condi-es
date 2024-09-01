import java.util.Scanner;

public class Diasdasemana {
    public static void main(String[] args) {
        // Passo 1: Crie uma variável que armazene um número de 1 a 7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
        int dia = scanner.nextInt();

        // Passo 2: Usando a estrutura switch, imprima o nome do dia correspondente
        String nomeDoDia;
        switch (dia) {
            case 1:
                nomeDoDia = "Segunda-feira";
                break;
            case 2:
                nomeDoDia = "Terça-feira";
                break;
            case 3:
                nomeDoDia = "Quarta-feira";
                break;
            case 4:
                nomeDoDia = "Quinta-feira";
                break;
            case 5:
                nomeDoDia = "Sexta-feira";
                break;
            case 6:
                nomeDoDia = "Sábado";
                break;
            case 7:
                nomeDoDia = "Domingo";
                break;
            default:
                nomeDoDia = "Número inválido. Por favor, digite um número de 1 a 7.";
                break;
        }

        // Passo 3: Imprima o nome do dia ou a mensagem de erro
        System.out.println(nomeDoDia);

        // Fechar o scanner
        scanner.close();
    }
}
