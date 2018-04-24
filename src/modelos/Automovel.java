package modelos;

public class Automovel {
	protected String marca;
	protected String modelo;
	protected String placa;
	protected int qtdMaxocupantes;

	public Automovel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automovel(String marca, String modelo, String placa, int qtdMaxocupantes) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.qtdMaxocupantes = qtdMaxocupantes;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getQtdMaxocupantes() {
		return qtdMaxocupantes;
	}

	public void setQtdMaxocupantes(int qtdMaxocupantes) {
		this.qtdMaxocupantes = qtdMaxocupantes;
	}

	@Override
	public String toString() {
		return "Automovel [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", qtdMaxocupantes="
				+ qtdMaxocupantes + "]";
	}

}
