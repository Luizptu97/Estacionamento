package principal;

import java.util.*;


public class GerenciaVeiculo {

	private ArrayList<Veiculo> veics;
	private Scanner sc = new Scanner(System.in);
	private boolean teste;
	private String OPCAO, placa, chassi, marca, modelo;
	private int anoFabricacao, anoModelo, tipoVeiculo, port, passageiros;
	private float cilind, carga;
	
	public GerenciaVeiculo(ArrayList<Veiculo> veics) {
		this.veics = veics;
		
	}
	
	
	public void cadastrarVeiculo() {
		do {
		
			do {
				teste = true;
				System.out.println("Digite o tipo de veiculo que deseja cadastrar");
				System.out.println("1 - Carro");
				System.out.println("2 - Moto ");
				System.out.println("3 - Caminhão");
				System.out.println("4 - Ônibus");
				System.out.println("0 - Sair do cadastro de veículo");
				String tipoV = sc.nextLine();
				
				try {
					tipoVeiculo = Integer.valueOf(tipoV).intValue();
					teste = false;
				}catch(NumberFormatException n) {
					System.out.println("Por favor, informe apenas numeros");
				}catch(Exception e) {
					System.out.println("Algo de errado aconteceu, tente novamente :( ");	
				}
			}while(teste);
		}while(tipoVeiculo < 1 || tipoVeiculo > 4);
		if(tipoVeiculo == 0) {
			System.out.println("Cadastro de veículo cancelado");
			
		}else {
					do {
						teste = false;
						System.out.println("Informe a placa do veículo: ");
						placa = sc.nextLine();
						for (Veiculo veiculos : veics) {
							if(veiculos.getPlaca().equals(placa)) {
								teste = true;
								}
							}
						if(teste) {
							System.out.println("essa placa já esta cadastrada no sistema");
							System.out.println("*Digite 0 para sair ou qualquer outro digito para tentar novamente*");
							 OPCAO = sc.nextLine();
							if(OPCAO == "0") {
							teste = true;	
							}
						}
					}while(teste);
		
		if(OPCAO != "0") {
							do {
								teste = false;
								System.out.println("Informe o chassi do veículo: ");
								chassi = sc.nextLine();
								for (Veiculo veiculos : veics) {
									if(veiculos.getChassi().equals(chassi)) {
										teste = true;
										}
									}
								if(teste) {
									System.out.println("Esse chassi já esta cadastrada no sistema");
									System.out.println("*Digite 0 para sair ou qualquer outro digito para tentar novamente*");
									 OPCAO = sc.nextLine();
									if(OPCAO == "0") {
									teste = true;	
									}
								}
							}while(teste);
			
			if(OPCAO != "0") {
			System.out.println("Digite a marca do veículo");
			marca = sc.nextLine();
			System.out.println("Digite o modelo do veículo");
			modelo = sc.nextLine();
						do {
							teste = true;
							System.out.println("Informe o ano do modelo: ");
							String anoM= sc.nextLine();
			
							try {
								anoModelo= Integer.valueOf(anoM).intValue();
								teste = false;
							}catch(NumberFormatException n) {
								System.out.println("Por favor, informe apenas numeros");
							}catch(Exception e) {
								System.out.println("Algo de errado aconteceu, tente novamente :( ");
							}
						}while(teste);
						do {
							teste = true;
							System.out.println("Informe o ano de fabricação: ");
							String anoF= sc.nextLine();
			
							try {
								anoFabricacao = Integer.valueOf(anoF).intValue();
								teste = false;
							}catch(NumberFormatException n) {
								System.out.println("Por favor, informe apenas numeros");
							}catch(Exception e) {
								System.out.println("Algo de errado aconteceu, tente novamente :( ");
							}
						}while(teste);
						
						switch(tipoVeiculo) {
						case 1:
							do {
								teste = true;
								System.out.println("Informe o numero de portas do carro ");
								String portas = sc.nextLine();
								try {
									port = Integer.valueOf(portas).intValue();
									teste = false;
								}catch(NumberFormatException n) {
									System.out.println("Por favor, informe apenas numeros");
								}catch(Exception e) {
									System.out.println("Algo de errado aconteceu, tente novamente :( ");
								}
							}while(teste);
							veics.add(new Carro(marca, modelo, chassi, placa, anoFabricacao, anoModelo, port));
						break;
							
						case 2:
							do {
								teste = true;
								System.out.println("Digite o numero de cilindradas");
								cilind = sc.nextFloat();
								
								if(cilind <  49){
									System.out.println("Bicletas elétricas não são permitidas");
								}else {
									if(cilind > 2800) {
										System.out.println("Reveja o numero de cilindradas");
									}else {
										teste = false;
									}
								}
							}while(teste);
						veics.add(new Moto(marca, modelo, chassi, placa, anoFabricacao, anoModelo, cilind));
						break;
						
						case 3:
							
							do {
								teste = true;
								System.out.println("Digite a carga do caminhão em KG");
								carga = sc.nextFloat();
								
								if(carga <  0){
									System.out.println("Elétrons possuem carga negativa, seu caminhão não!");
								}else {
									if(carga > 999999999) {
										System.out.println("Pega leve com o caminhão");
									}else {
										teste = false;
									}
								}
							}while(teste);
						veics.add(new Caminhao(marca, modelo, chassi, placa, anoFabricacao, anoModelo, carga));
						break;
						
						case 4:
							do {
								teste = true;
								System.out.println("Informe a capacidade de passageiros ");
								String portas = sc.nextLine();
								try {
									port = Integer.valueOf(portas).intValue();
									teste = false;
								}catch(NumberFormatException n) {
									System.out.println("Por favor, informe apenas numeros");
								}catch(Exception e) {
									System.out.println("Algo de errado aconteceu, tente novamente :( ");
								}
							}while(teste);
							veics.add(new Onibus(marca, modelo, chassi, placa, anoFabricacao, anoModelo, passageiros));
						break;
						}
				
			
			
			
			}else {
				System.out.println("Operação cancelada");
			}
		}else {
			System.out.println("Operação cancelada");
		}
	}	
	}	
		
		
		
		
		
	public void relatorio() {
		Iterator<Veiculo> it = veics.iterator();
		Veiculo v;
		
		if(veics.isEmpty()) {	
			System.out.println("Nao existe veiculos cadastrados no momento");
		}else {
			while(it.hasNext())
			{	
				v = it.next();
				v.imprimir();
			}
		}	
		v = null;
	}
			
		
		
		
		
		
		
		
		
		
		
		
}
