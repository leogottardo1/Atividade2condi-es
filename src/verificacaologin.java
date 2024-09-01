import java.util.Scanner;

public class verificacaologin {
    public static void main(String[] args) {

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuarioInserido = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaInserida = scanner.nextLine();


        if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)) {

            System.out.println("Autenticação bem-sucedida!");
        } else {

            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }


        scanner.close();
    }
}
