package br.com.concorrencia.support;

public class Expected {
    public String xpath;
    public String valorEsperado;
    public Expected(String xpath, String valorEsperado) {
        this.xpath = xpath;
        this.valorEsperado = valorEsperado;
    }
}
