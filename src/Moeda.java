public class Moeda {

    public String siglaBase;
    public Float valorBase;


    public Moeda(String siglaBase, Float valorBase) {
        this.siglaBase = siglaBase;
        this.valorBase = valorBase;
    }

    public String getSiglaBase() {
        return siglaBase;
    }


    public Float getValorBase() {
        return valorBase;
    }

    public void setSiglaBase(String siglaBase) {
        this.siglaBase = siglaBase;
    }

    public void setValorBase(Float valorBase) {
        this.valorBase = valorBase;
    }

}
