package principal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class GerenciaConta {

	private ArrayList<Conta> contas;
	private ArrayList<Veiculo> veiculos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Patio> patios;
	private String placa, nomePatio, nomeCliente;
	private Scanner sc = new Scanner(System.in);
	boolean achou, teste2, opr;
	private String mes, ano, opcao, diariaS;
	int MES, ANO, diarias;
	Conta conta;
	
	public GerenciaConta(ArrayList<Conta> contas, ArrayList<Veiculo> veiculos, ArrayList<Cliente> clientes,
			ArrayList<Patio> patios) {
		super();
		this.contas = contas;
		this.veiculos = veiculos;
		this.clientes = clientes;
		this.patios = patios;
	}
	
	public void cadastrarConta() {
		Veiculo veiculo = null;
		Patio patio = null;
		Cliente cliente = null;
		if(veiculos.isEmpty() || clientes.isEmpty() || patios.isEmpty()) {	
			System.out.println("Voc� precisa ter ao menos 1 veiculo, 1 patio e 1 cliente cadastrados ");
			System.out.println("             no sistema para poder gerar uma nova conta              ");
		}else {
			System.out.println("---------------------- Cadastrar Conta ----------------------");
			do {
			System.out.println("Digite a placa do ve�culo associado a conta: ");
			System.out.println("ou digite '0' para listar todas os ve�culos dispon�veis");
			placa = sc.nextLine();
			System.out.println(placa);
			if(placa.equals("0")) {
				Iterator<Veiculo> it = veiculos.iterator();
				Veiculo v;
				while(it.hasNext())
				{	
					v = it.next();
					if(v instanceof Moto) {
						System.out.println("Tipo de veiculo: Motocicleta");
						System.out.println(v.getMarca() + " - " + v.getModelo());
						System.out.println("Placa: "+ v.getPlaca());
					}else {
						if(v instanceof Carro) {
							System.out.println("Tipo de veiculo: Carro");
							System.out.println(v.getMarca() + " - " + v.getModelo());
							System.out.println("Placa: "+ v.getPlaca());

						}else {
							if(v instanceof Caminhao) {
								System.out.println("Tipo de veiculo: Caminh�o");
								System.out.println(v.getMarca() + " - " + v.getModelo());
								System.out.println("Placa: "+ v.getPlaca());

							}else {
								System.out.println("Tipo de ve�culo: Onibus");
								System.out.println(v.getMarca() + " - " + v.getModelo());
								System.out.println("Placa: "+ v.getPlaca());

							}
						}
					}
					
				}	
			v = null;
			
			}else{
				for (Veiculo v : veiculos) {
					if(v.getPlaca().equalsIgnoreCase(placa)) {
						achou = true;
						veiculo = v;
						}
					}
			if(achou == false) {
				System.out.println(" ************** Placa n�o localizada **************");
			}
			}
			}while(!achou);
			
			do {
				achou = false;
				System.out.println("Digite o nome do p�tio para onde ser� gerada a conta: ");
				System.out.println("ou digite '0' para listar todos os patios");
				nomePatio = sc.nextLine();
				if(nomePatio.equals("0")) {
					Iterator<Patio> it = patios.iterator();
					Patio p;
					while(it.hasNext())
					{	
						p = it.next();
						System.out.println("P�tio: "+ p.getNome());
						System.out.println("Localizado em: " + p.getBairro() + ", " + p.getMunicipio() + " - " + p.getEstado());
						System.out.println("Lota��o: " + p.getLotacao()+"/"+p.getCapacidadeDeVeiculos());
					}	
				p = null;
				}else{
					for (Patio p: patios) {
						if(p.getNome().equalsIgnoreCase(nomePatio)) {
							achou = true;
							patio = p;
							}
						}
				if(achou == false) {
					System.out.println(" ************** Patio n�o localizado **************");
				}
				}
				}while(!achou);
			
				achou = false;
			for(Conta c : contas) {
				if(c.getPatio().getNome().equalsIgnoreCase(nomePatio) && c.getVeiculo().getPlaca().equalsIgnoreCase(placa)){
					System.out.println("**** O veiculo j� possui uma conta no p�tio informado ****");
					System.out.println("                   Cadastro cancelado                     ");
					achou = true;
				}
			}
			
			if(achou == false) {
				
				do {
					System.out.println("Digite o c�digo do cliente relacionado ao ve�culo");
					System.out.println("ou digite '0' para listar todos os clientes");
					String codigoCliente;
					boolean teste = true;
					int cod = 0;
					do {
						codigoCliente = sc.nextLine();
					try{
						cod = Integer.parseInt(codigoCliente); 
				   		}catch(NumberFormatException ex){
						System.out.println("\n                 ******** ERRO ********                  "); 
						System.out.println("                 Apenas n�mero s�o permitidos!!!           ");
						teste = false;
			       		}
					
					}while(!teste);
					
					if(cod == 0) {
						Iterator<Cliente> it = clientes.iterator();
						Cliente c;
						while(it.hasNext())
						{	
							c = it.next();
							System.out.println("Cliente c�digo: "+ c.getCodigo());
							System.out.println("Nome: " +  c.getNome());
						}	
					c = null;
					}else{
						
						for (Cliente c : clientes) {
							if(c.getCodigo() == cod) {
								achou = true;
								cliente = c;
								}
							}
					if(achou == false) {
						System.out.println(" ************** Cliente n�o localizado **************");
					}
					
					}
					}while(!achou);
					
				boolean teste;
				boolean teste2;
				int mes = 0;
				do {
					teste = true;
					teste2 = false;
					
					do {
						System.out.println("Digite o m�s referente a conta");
						String MES = sc.nextLine();
					try{
						mes = Integer.parseInt(MES); 
				   		}catch(NumberFormatException ex){
						System.out.println("\n                 ******** ERRO ********                  "); 
						System.out.println("                 Apenas n�mero s�o permitidos!!!           ");
						teste = false;
			       		}
					
					}while(!teste);
					
					if(mes < 1 || mes > 12) {
						teste2 = true;
						System.out.println("\n                 ******** ERRO ********                  "); 
						System.out.println("                       M�S INV�LIDO!!                      ");
					}
					
				}while(teste2);
				int ano = 0;
				do {
					teste = true;
					teste2 = false;
				
					do {
						System.out.println("Digite o ano referente a conta");
						String ANO = sc.nextLine();
					try{
						ano = Integer.parseInt(ANO); 
				   		}catch(NumberFormatException ex){
						System.out.println("\n                 ******** ERRO ********                  "); 
						System.out.println("                 Apenas n�mero s�o permitidos!!!           ");
						teste = false;
			       		}
					
					}while(!teste);
					
					if(ano < 2000 || ano > 2030) {
						teste2 = true;
						System.out.println("\n                 ******** ERRO ********                  "); 
						System.out.println("          ANO INV�LIDO!!  Escolha entre 2000 e 2030        ");
					}
					
				}while(teste2);
				Conta conta = new Conta();
				conta.setVeiculo(veiculo);
				conta.setPatio(patio);
				conta.setCliente(cliente);
				conta.setMes(mes);
				conta.setAno(ano);
				conta.setDiarias(0);
				conta.setPaga(false);
				contas.add(conta);
				
				
			}
		}
	}
	
	public void excluirConta() {
		int intTeste = 0;
		String stringTeste = null;
		boolean teste;
		if(veiculos.isEmpty() || clientes.isEmpty() || patios.isEmpty()) {	
			System.out.println("Voc� precisa ter ao menos 1 veiculo, 1 patio e 1 cliente cadastrados ");
			System.out.println("             no sistema para poder gerar uma nova conta              ");
		}else {
		do {
			teste = true;
			System.out.println("Digite o c�digo do cliente relacionado a conta");
		try{
			intTeste=Integer.parseInt(stringTeste); 
	   		}catch(NumberFormatException ex){
	   		System.out.println("             **************** ERRO FATAL ****************             ");
			System.out.println("           O c�digo do cliente precisa ser um numero inteiro          ");
			teste = false;
       		}
		if(teste == true) {
		if(validaCliente(intTeste) == false) {
			teste = false;
		}
		}
		}while(!teste);
	
	 do {
		 System.out.println("Informe a placa do ve�culo relacionado a conta");
		 placa = sc.nextLine();
		 teste = validaCarro(placa);
	 	}while(teste);
		do {
			teste = true;
		System.out.println("Informe o m�s de refer�ncia");
		mes = sc.nextLine();
		System.out.println("Informe o ano de referencia");
		ano = sc.nextLine();
		try {
			MES = Integer.valueOf(mes).intValue();
			ANO = Integer.valueOf(ano).intValue();
			
		} catch (NumberFormatException n) {
			System.out.println("Por favor, informe apenas numeros");
			teste = false;
		} catch (Exception e) {
			System.out.println("Algo de errado aconteceu, tente novamente :( ");
			teste = false;
		}
		
		}while(!teste);
		}
		teste = true;
		for (Conta c : contas) {
			if(c.getVeiculo().getPlaca().equalsIgnoreCase(placa) && (c.getCliente().getCodigo() == intTeste) && (c.getMes()==MES) && c.getAno() == ANO) {
				Conta conta = c;
			}else {
				System.out.println(" ***** N�o localizamos nenhuma conta com os dados informados ******");
				teste = false;
			}
		}
		
			if(teste != false) {
				do {
					teste = false;
				conta.imprimir();
				System.out.println("          Deseja realmente excluir essa conta?            ");
				System.out.println("            1 - SIM       |         2 - N�O                 ");
				opcao = sc.nextLine();
				try{
					int SOP =Integer.parseInt(opcao); 
			   		}catch(NumberFormatException ex){
					System.out.println("******** ERRO ******** \n Op��o inv�lida, apenas numeros s�o permitidos \n\n");
					teste = true;
	           		}
			}while(teste);
			}
			do {
				opr = false;
			if(opcao.equals("1")) {
				conta = null;
				System.out.println("Conta exclu�da com sucesso");
				opr = true;
			}else {
				if(opcao.equals("2")) {
					System.out.println("Exclus�o cancelada");
					opr = true;
				}else {
					System.out.println(" ************* OPC�O INV�LIDA *****************");
				}
			}
			
			}while(!opr);
	}
	
	
	public void incrementaDiarias() {
		int intTeste = 0;
		String stringTeste = null;
		boolean teste;
		if(veiculos.isEmpty() || clientes.isEmpty() || patios.isEmpty()) {	
			System.out.println("Voc� precisa ter ao menos 1 veiculo, 1 patio e 1 cliente cadastrados ");
			System.out.println("             no sistema para poder gerar uma nova conta              ");
		}else {
		do {
			teste = true;
			System.out.println("Digite o c�digo do cliente relacionado a conta");
			stringTeste = sc.nextLine();
		try{
			intTeste=Integer.parseInt(stringTeste); 
	   		}catch(NumberFormatException ex){
	   		System.out.println("             **************** ERRO FATAL ****************             ");
			System.out.println("           O c�digo do cliente precisa ser um numero inteiro          ");
			teste = false;
       		}
		if(teste == true) {
		if(validaCliente(intTeste) == false) {
			teste = false;
		}
		}
		}while(!teste);
	
	 do {
		 System.out.println("Informe a placa do ve�culo relacionado a conta");
		 placa = sc.nextLine();
		 teste = validaCarro(placa);
	 	}while(!teste);
		do {
			teste = true;
		System.out.println("Informe o m�s de refer�ncia");
		mes = sc.nextLine();
		System.out.println("Informe o ano de referencia");
		ano = sc.nextLine();
		try {
			MES = Integer.valueOf(mes).intValue();
			ANO = Integer.valueOf(ano).intValue();
			
		} catch (NumberFormatException n) {
			System.out.println("Por favor, informe apenas numeros");
			teste = false;
		} catch (Exception e) {
			System.out.println("Algo de errado aconteceu, tente novamente :( ");
			teste = false;
		}
		
		}while(!teste);
		}
		teste = true;
		for (Conta c : contas) {
			if(c.getVeiculo().getPlaca().equalsIgnoreCase(placa) && (c.getCliente().getCodigo() == intTeste) && (c.getMes()==MES) && c.getAno() == ANO) {
				conta = c;
			}else {
				System.out.println(" ***** N�o localizamos nenhuma conta com os dados informados ******");
				teste = false;
			}
		}
			if(teste != false) {
				do {
					teste2 = false;
				do {
					teste = false;
					System.out.println("Digite quantas di�rias voc� deseja incrementar");
					String di = sc.nextLine();
				try{
					diarias = Integer.parseInt(di); 
			   		}catch(NumberFormatException ex){
					System.out.println("******** ERRO ******** \n Apenas n�mero s�o permitidos \n\n");
					teste = true;
	           		}
				}while(teste);
				
				if(conta.getDiarias() + diarias > 31) {
					System.out.println("**** O numero de di�rias ultrapassou o limite mensal, para isso crie uma nova conta no m�s seguinte **** ");
				}else {
					conta.setDiarias(conta.getDiarias() + diarias);
				}
				}while(teste2);
			}
	
	}
	
	public void pagaDiarias() {
		int intTeste = 0;
		String stringTeste = null;
		boolean teste;
		if(veiculos.isEmpty() || clientes.isEmpty() || patios.isEmpty()) {	
			System.out.println("Voc� precisa ter ao menos 1 veiculo, 1 patio e 1 cliente cadastrados ");
			System.out.println("             no sistema para poder gerar uma nova conta              ");
		}else {
		do {
	
			teste = true;
			System.out.println("Digite o c�digo do cliente relacionado a conta");
			stringTeste = sc.nextLine();
		try{
			intTeste=Integer.parseInt(stringTeste); 
	   		}catch(NumberFormatException ex){
	   		System.out.println("             **************** ERRO FATAL ****************             ");
			System.out.println("           O c�digo do cliente precisa ser um numero inteiro          ");
			teste = false;
       		}
		if(teste == true) {
		if(validaCliente(intTeste) == false) {
			teste2 = false;
		}
		}
		}while(!teste);
	
	 do {
		 teste = true;
		 System.out.println("Informe a placa do ve�culo relacionado a conta");
		 placa = sc.nextLine();
		 teste = validaCarro(placa);
	 	}while(!teste);
		do {
			teste = true;
		System.out.println("Informe o m�s de refer�ncia");
		mes = sc.nextLine();
		System.out.println("Informe o ano de referencia");
		ano = sc.nextLine();
		try {
			MES = Integer.valueOf(mes).intValue();
			ANO = Integer.valueOf(ano).intValue();
			
		} catch (NumberFormatException n) {
			System.out.println("Por favor, informe apenas numeros");
			teste = false;
		} catch (Exception e) {
			System.out.println("Algo de errado aconteceu, tente novamente :( ");
			teste = false;
		}
		
		}while(!teste);
		}
		teste = true;
		for (Conta c : contas) {
			if(c.getVeiculo().getPlaca().equalsIgnoreCase(placa) && (c.getCliente().getCodigo() == intTeste) && (c.getMes()==MES) && c.getAno() == ANO) {
				conta = c;
			}else {
				System.out.println(" ***** N�o localizamos nenhuma conta com os dados informados ******");
				teste = false;
			}
		}
		
			if(teste != false) {
				do {
					teste = false;
				System.out.println(" Deseja pagar as di�rias separadamente, ou quitar a conta?");
				System.out.println("    1 - Pagar di�rias avulsas   |   2 - Liquidar conta    ");
				opcao = sc.nextLine();
				try{
					int SOP =Integer.parseInt(opcao); 
			   		}catch(NumberFormatException ex){
					System.out.println("******** ERRO ******** \n Op��o inv�lida, apenas numeros s�o permitidos \n\n");
					teste = true;
	           		}
			}while(teste);
				do {
			opr = false;
				if(opcao.equals("1")) {
					do {
						teste2 = false;
						teste = false;
						do {
							System.out.println("Informe quantas di�rias deseja pagar");
							diariaS = sc.nextLine();
							try {
								diarias = Integer.parseInt(diariaS);
							}catch (NumberFormatException ex) {
								System.out.println(
										"******** ERRO ******** \n Op��o inv�lida, apenas numeros s�o permitidos \n\n");
								teste = true;
							}
						}while(teste);

						if(diarias > conta.getDiarias()) {
							System.out.println("N�mero informado maior que o d�bito de di�rias");
						}else {
							teste2 = true;
						}
					}while(!teste2);
					conta.setDiarias(conta.getDiarias() - diarias);
					opr = true;
					System.out.println("Foram pagas "+ diarias + " diarias!");
					
				}else {
					if(opcao.equals("2")) {
						conta.setDiarias(0);
						conta.setPaga(true);
						System.out.println("Conta Liquidada");
						opr = true;
					}else {
					System.out.println("Opcao inv�lida");	
					}
				}
				}while(!opr);
			}
			}
	
	public void relatorio(){
		if(contas.isEmpty()) {	
			System.out.println("Nao existem contas cadastradas no momento");
		}else {
		 Iterator<Conta> contasIterator = contas.iterator();
         while (contasIterator.hasNext()){
                Conta it = contasIterator.next();   
                it.imprimir();
                
                
         }
         contasIterator = null;
		}
	}
	
	private boolean validaCarro(String placa) {
				for (Veiculo veic : veiculos) {
					if(veic.getPlaca().equalsIgnoreCase(placa)) {
						achou = true;
						}
					}
			if(achou == false) {
				System.out.println(" ************** Placa n�o localizada **************");
				return false;
			}else {
				return true;
			}
		}
	
	private boolean validaCliente(int codigo) {
				for (Cliente cli : clientes) {
					if(cli.getCodigo() == codigo) {
						achou = true;
						}
					}
			if(achou == false) {
				System.out.println(" ************** C�digo de cliente n�o localizado **************");
				return false;
			}else {
				return true;
			}	
	}
	
	
	}
	
	
	

