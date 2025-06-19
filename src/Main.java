import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        ConverteMoeda converteMoeda = new ConverteMoeda();
        String sigla;

        System.out.println("Bem-vindo(a) ao conversor de moeda!");
        System.out.println("\n1) Real >>>>> Dolar");
        System.out.println("2) Dolar >>>>> Real");
        System.out.println("3) Euro >>>>> Real");
        System.out.println("4) Real >>>>> Euro");
        System.out.println("5) Guarani >>>>> Real");
        System.out.println("6) Real >>>>> Guarani");
        System.out.println("7) Sair");
        System.out.println("Escolha uma opção válida: ");

        int opcao = leitura.nextInt();
        System.out.println("Digite o valor: ");
        float valor = leitura.nextFloat();

        if (opcao == 1 || opcao == 4 || opcao == 6) {
            sigla = "BRL";
            Moeda moeda = converteMoeda.buscaMoeda(sigla, valor);
        } else if (opcao == 2) {
            sigla = "USD";
            Moeda moeda = converteMoeda.buscaMoeda(sigla, valor);
        } else if (opcao == 3) {
            sigla = "EUR";
            Moeda moeda = converteMoeda.buscaMoeda(sigla, valor);
        } else if (opcao == 5) {
            sigla = "PYG";
            Moeda moeda = converteMoeda.buscaMoeda(sigla, valor);
        } else if (opcao == 7) {
            System.out.println("Finalizando...");
        }

        System.out.println("   Progarma finalizado!");

    }
}
