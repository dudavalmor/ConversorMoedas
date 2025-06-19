import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ConverteSigla converteSigla = new ConverteSigla();
        Busca buscar = new Busca();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String sigla = "";

        System.out.println("Seja bem-vindo ao Conversor de Moedas!");
        System.out.println("\n1) Real >> Dolar");
        System.out.println("2) Real >> Euro");
        System.out.println("3) Real >> Guarani");
        System.out.println("4) Dolar >> Real");
        System.out.println("5) Euro >> Real");
        System.out.println("6) Guarani >> Real");
        System.out.println("7) Sair");
        System.out.println("Digite a opção: ");

        int opcao = leia.nextInt();
        MoedaRecord moedaRecord = converteSigla.converter(opcao);

        if (opcao != 7){
            System.out.println("Digite o valor que deseja converter: ");
            float valor = leia.nextFloat();

            float taxa = buscar.buscarTaxa(moedaRecord);
            float resultado = valor * taxa;

            System.out.printf("%.2f %s convertidos para %s:\n", valor, moedaRecord.siglaBase(), moedaRecord.siglaConvertida());
            System.out.printf("Taxa: %.4f\n", taxa);
            System.out.printf("Valor convertido: %.2f\n", resultado);
        }

        if (opcao == 7) {
            System.out.println("Finalizando o programa....");
        }

        System.out.println("Programa finalizado.");

    }
}
