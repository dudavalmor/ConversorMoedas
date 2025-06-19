import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConverteMoeda {
    public Moeda buscaMoeda (String siglaBase, Float valorBase){
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/56859e5e9a48f7b032c00a5b/latest/" + siglaBase);

        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try{
            HttpResponse<String> response = HttpClient.newHttpClient().send(request,HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e){
            throw new RuntimeException("Não consegui obter a moeda..");
        }

    }
}
