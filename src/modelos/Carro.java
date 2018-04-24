package modelos;

public class Carro extends Automovel {

	private int qtdPortas;

	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro(String marca, String modelo, String placa, int qtdMaxocupantes) {
		super(marca, modelo, placa, qtdMaxocupantes);
		// TODO Auto-generated constructor stub
	}

	public Carro(int qtdPortas) {
		super();
		this.qtdPortas = qtdPortas;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	@Override
	public String toString() {
		return toString() + "Carro [qtdPortas=" + qtdPortas + "]";
	}

}
