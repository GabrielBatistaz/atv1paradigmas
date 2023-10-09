public class Carro {
    private int anofabricacao;
    private String cor;
    private String marca;
    private double velomax;
    private String motor;
    private String cambio;
    private String chasi;
    private String banco;

    public Carro(int anofabricacao, String cor, String marca, double velomax, String motor, String cambio, String chasi, String banco) {
        this.anofabricacao = anofabricacao;
        this.cor = cor;
        this.marca = marca;
        this.velomax = velomax;
        this.motor = motor;
        this.cambio = cambio;
        this.chasi = chasi;
        this.banco = banco;
    }

    public int getAnoFabricacao() {
        return anofabricacao;
    }

    public void setAnoFabricacao(int anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velomax;
    }

    public void setVelocidadeMaxima(double velomax) {
        this.velomax = velomax;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getChassi() {
        return chasi;
    }

    public void setChassi(String chasi) {
        this.chasi = chasi;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    public void acelera(){
        System.out.println("Acelerando " + marca);
    }
    public void freia(){
        System.out.println("Freiando " + marca)
    }
    public void liga(){
        System.out.println("Ligando " + marca)
    }
    public void desliga(){
        System.out.println("Desligandos " + marca)
    }   
}
