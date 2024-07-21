import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cod1;
        int cod2;
        int quantidade1;
        int quantidade2;
        double preco1;
        double preco2;
        double total;

        System.out.println("Digite o codigo 1");
        cod1 = sc.nextInt();
        System.out.println("Digite a quantidade 1");
        quantidade1 = sc.nextInt();
        System.out.println("Digite o preco 1");
        preco1 = sc.nextDouble();


        System.out.println("Digite o codigo 2");
        cod2 = sc.nextInt();
        System.out.println("Digite a quantidade 2");
        quantidade2 = sc.nextInt();
        System.out.println("Digite o preco 2");
        preco2 = sc.nextDouble();

        total = preco1 * quantidade1 + preco2 * quantidade2;

        System.out.printf("Valor total a pagar R$%2f%n" , total);

        sc.close();

        }

}