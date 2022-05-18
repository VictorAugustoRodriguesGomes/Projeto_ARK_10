package ark10;

public class Carro {

    private String códico;
    private String nome;
    private String marca;
    private String modelo;
    private float preço;
    private float valorDeLocação;
    private int diasDeLocação;
    private float valorTotalDoAluguel;

    public Carro(String códico, String nome, String marca, String modelo, float preço, float valorDeLocação, int diasDeLocação, float valorTotalDoAluguel) {
        this.códico = códico;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.preço = preço;
        this.valorDeLocação = valorDeLocação;
        this.diasDeLocação = diasDeLocação;
        this.valorTotalDoAluguel = valorTotalDoAluguel;
    }

    public String getCódico() {
        return códico;
    }

    public void setCódico(String códico) {
        this.códico = códico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public float getValorDeLocação() {
        return valorDeLocação;
    }

    public void setValorDeLocação(float valorDeLocação) {
        this.valorDeLocação = valorDeLocação;
    }

    public int getDiasDeLocação() {
        return diasDeLocação;
    }

    public void setDiasDeLocação(int diasDeLocação) {
        this.diasDeLocação = diasDeLocação;
    }

    public float getValorTotalDoAluguel() {
        return valorTotalDoAluguel;
    }

    public void setValorTotalDoAluguel(float valorTotalDoAluguel) {
        this.valorTotalDoAluguel = valorTotalDoAluguel;
    }

    public void AlterarValorDeLocação(float NovoValor) {
        this.valorDeLocação = NovoValor;
    }

    public String[] ExibirInformaçoes() {
        return new String[]{
            this.códico,
            this.nome,
            this.marca,
            this.modelo,
            Float.toString(this.preço),
            Float.toString(this.valorDeLocação),
            Integer.toString(this.diasDeLocação),
            Float.toString(this.valorTotalDoAluguel)

        };
    }

    public String ExibirNome() {
        return this.nome + " - " + this.códico;
    }

    public float CalcularValorMulta(int quantidadesDeDias, int diasdelocação, float valordelocação) {
        this.diasDeLocação = diasdelocação;
        this.valorDeLocação = valordelocação;
        if (quantidadesDeDias > this.diasDeLocação) {
            int diferença = quantidadesDeDias - this.diasDeLocação;
            return (float) ((this.valorDeLocação * 0.15) * diferença);
        }
        return 0;
    }

    public float CalcularValorToltal(int quantidadesDeDias, int diasdelocação, float valordelocação) {
        this.valorDeLocação = valordelocação;
        float multa = this.CalcularValorMulta(quantidadesDeDias, diasdelocação, valordelocação);
        return (this.valorDeLocação * quantidadesDeDias) + multa;
    }
}
