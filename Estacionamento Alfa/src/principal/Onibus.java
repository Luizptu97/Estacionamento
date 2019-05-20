package principal;

public class Onibus extends Veiculo {

	int capacidadePassageiros;

	public Onibus(String marca, String modelo, String chassi, String placa, int anoFabricacao, int anoModelo,
			int capacidadePassageiros) {
		super(marca, modelo, chassi, placa, anoFabricacao, anoModelo);
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public Onibus() {
		
	}
	
	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	

	public void imprimir()
	{
		System.out.println("Placa do veículo:    " + placa);
		System.out.println("Modelo:              "+ modelo);
		System.out.println("Marca:               "+ marca);
		System.out.println("Chassi:              "+ chassi);
		System.out.println("Ano do modelo:       "+ anoModelo);
		System.out.println("Ano de fabricação:   "+ anoFabricacao);
		System.out.println("Cap. de passageiros: " + capacidadePassageiros);
		System.out.println("-------------------------------------------------");
		
		
	}
}
