public class Automovel {
    private String cor;
    private String placa;
    private String modelo;
    private Bool ligado;
    private Bool emMovimento;

    public Automovel(cor, placa, modelo, ligado, emMovimento) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ligado = false;
        this.emMovimento = false;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O veículo já está ligado");
        } else {
            System.out.println("O veículo está desligado");
            System.out.println("Ligando o carro...");
            ligado = true;
            System.out.println("O carro está ligado");
        }
    }

    public void mover() {
        if (ligado) {
            emMovimento = true;
            System.out.println("O veículo está se movendo");
        } else {
            System.out.println("O veículo não pode se mover porque está desligado");
        }
    }

    public void parar() {
        if (emMovimento) {
            emMovimento = false;
            System.out.println("O veículo parou");
        } else {
            System.out.println("O veículo já está parado");
        }
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Bool getIsLigado() {
        return ligado;
    }

    public Bool getIsEmMovimento() {
        return emMovimento;
    }

    
}