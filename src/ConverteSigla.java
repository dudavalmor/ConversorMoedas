public class ConverteSigla {
    public MoedaRecord converter(int opcao) {
        return switch (opcao) {
            case 1 -> new MoedaRecord("BRL", "USD");
            case 2 -> new MoedaRecord("BRL", "EUR");
            case 3 -> new MoedaRecord("BRL", "PYG");
            case 4 -> new MoedaRecord("USD", "BRL");
            case 5 -> new MoedaRecord("EUR", "BRL");
            case 6 -> new MoedaRecord("PYG", "BRL");
            default -> new MoedaRecord("BRL", "USD");
        };
    }

}

