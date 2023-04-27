public class Carro extends Automovel{
	private boolean tetoSolar;
	private boolean aberto;

	public Carro(String cor, String placa, String modelo, boolean tetoSolar) {
		super(cor, placa, modelo);
		this.tetoSolar = tetoSolar;
		this.aberto = false;
	}
	
	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public void abrirFechar() {
		if (this.aberto == true) {
			this.aberto = false;
			System.out.println("Carro fechado.");
		} else {
			this.aberto = true;
			System.out.println("Carro aberto.");
		}
	}