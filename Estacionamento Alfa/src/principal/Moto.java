package principal;

public class Moto extends Veiculo {

	float cilindradas;
	

	public Moto(String marca, String modelo, String chassi, String placa, int anoFabricacao, int anoModelo,
			float cilindradas) {
		super(marca, modelo, chassi, placa, anoFabricacao, anoModelo);
		this.cilindradas = cilindradas;
	}

	public float getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(float cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public void imprimir()
	{
		System.out.println("Placa do veículo:    " + placa);
		System.out.println("Modelo:              "+ modelo);
		System.out.println("Marca:               "+ marca);
		System.out.println("Chassi:              "+ chassi);
		System.out.println("Ano do modelo:       "+ anoModelo);
		System.out.println("Ano de fabricação:   "+ anoFabricacao);
		System.out.println("Cilindradas:         "+ cilindradas);
		System.out.println("-------------------------------------------------");
		
		
	}
}
