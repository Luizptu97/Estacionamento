package principal;

public class Carro extends Veiculo{

	int quantidadePortas;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public Carro() {
		super();
	}

	public Carro(String marca, String modelo, String chassi, String placa, int anoFabricacao, int anoModelo, int quantidadePortas) {
		super(marca, modelo, chassi, placa, anoFabricacao, anoModelo);
		this.quantidadePortas = quantidadePortas;
	}
	
	public void imprimir()
	{
		System.out.println("Placa do veículo:    " + placa);
		System.out.println("Modelo:              "+ modelo);
		System.out.println("Marca:               "+ marca);
		System.out.println("Chassi:              "+ chassi);
		System.out.println("Ano do modelo:       "+ anoModelo);
		System.out.println("Ano de fabricação:   "+ anoFabricacao);
		System.out.println("Quant. de Portas:    "+ quantidadePortas);
		System.out.println("-------------------------------------------------");
	}
	
}
