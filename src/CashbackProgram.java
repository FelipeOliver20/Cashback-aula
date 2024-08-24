import java.util.Scanner;

public class CashbackProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Para receber os dados do cliente
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        // Calcula o cashback de acordo com as regras citadas pelo professor
        double cashback = 0.0;
        if (idade >= 21) {
            if (valorCompra < 1000) {
                cashback = valorCompra * 0.05;
            } else {
                cashback = valorCompra * 0.07;
            }
        } else { // Idade menor que 21
            if (valorCompra < 1000) {
                cashback = valorCompra * 0.07;
            } else {
                cashback = valorCompra * 0.10;
            }
        }

        // Exibe os resultados que foram especificados
        System.out.println("\nCliente: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Valor do cashback: R$ %.2f%n", cashback);

        scanner.close();
    }
}