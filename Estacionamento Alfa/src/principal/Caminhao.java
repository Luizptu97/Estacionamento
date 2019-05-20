package principal;

public class Caminhao extends Veiculo {

	float capacidadeCarga;

	public Caminhao() {
		super();
		
	}

	public Caminhao(String marca, String modelo, String chassi, String placa, int anoFabricacao, int anoModelo, float capacidadeCarga) {
		super(marca, modelo, chassi, placa, anoFabricacao, anoModelo);
		this.capacidadeCarga = capacidadeCarga;
	}

	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(float capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	
	public void imprimir()
	{
		System.out.println("Placa do veículo:    " + placa);
		System.out.println("Modelo:              "+ modelo);
		System.out.println("Marca:               "+ marca);
		System.out.println("Chassi:              "+ chassi);
		System.out.println("Ano do modelo:       "+ anoModelo);
		System.out.println("Ano de fabricação:   "+ anoFabricacao);
		System.out.println("Cap. de Carga:       "+ capacidadeCarga);
		System.out.println("-------------------------------------------------");
		
		
	}
	
	
}
