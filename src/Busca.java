import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busca {
    public Moeda buscaMoeda (String sigla){
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/56859e5e9a48f7b032c00a5b/latest/" + sigla);

        HttpRequest request = HttpRequest.newBuilder().uri(uri).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            //System.out.println(json);
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter a conversão.");
        }
    }

    public static float buscarTaxa(MoedaRecord moedaRecord) {
        try {
            URI uri = URI.create("https://v6.exchangerate-api.com/v6/56859e5e9a48f7b032c00a5b/latest/" + moedaRecord.siglaBase());
            HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject taxas = json.getAsJsonObject("conversion_rates");

            return taxas.get(moedaRecord.siglaConvertida()).getAsFloat();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar taxa de conversão");
        }
    }





}
