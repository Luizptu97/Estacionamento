package principal;

public abstract class Veiculo {

	String marca, modelo, chassi, placa;
	int anoFabricacao, anoModelo;
	
	public Veiculo(String marca, String modelo, String chassi, String placa, int anoFabricacao, int anoModelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.chassi = chassi;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
	}
	
	public Veiculo() {
		
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
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	
	
	public void imprimir(){
		System.out.println("Placa do veículo:  " + placa);
		System.out.println("Modelo:            "+ modelo);
		System.out.println("Marca:             "+ marca);
		System.out.println("Chassi:            "+ chassi);
		System.out.println("Ano do modelo:     "+ anoModelo);
		System.out.println("Ano de fabricação: "+ anoFabricacao);
		
	}
	
	
	
}
