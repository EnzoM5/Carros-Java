public class Carro {
    private String modelo;
    private String cor;
    private String descricao;
    private float velocidadeMaxima;


    public Carro(String modelo, String cor, String descricao, float velocidadeMaxima) {
        this.modelo = modelo;
        this.cor = cor;
        this.descricao = descricao;
        this.velocidadeMaxima = velocidadeMaxima;
    }





    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }





    
}
