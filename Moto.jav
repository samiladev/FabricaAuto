public class Moto extends Automovel {

    private boolean freioAbs;
    private boolean bau;

    public Moto(String cor, String placa, String modelo, boolean freioAbs, boolean bau) {
        super(cor, placa, modelo);
        this.freioAbs = freioAbs;
        this.bau = bau;
    }

    public boolean isFreioAbs() {
        return freioAbs;
    }

    public void setFreioAbs(boolean freioAbs) {
        this.freioAbs = freioAbs;
    }

    public boolean isBau() {
        return bau;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }

    public void alarme() {
        System.out.println("Alarme ligado.");
    }
}