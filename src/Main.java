import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            int idade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println( "Digite sua idade: ");
        idade = sc.nextInt();


        if (idade>= 18) {
            System.out.println("é maior de idade");

        }else{
            System.out.println("não é maior de idade");
        }

    }



}
p