package principal;
import java.util.*;

public class GerenciaConta {

	private ArrayList<Conta> contas;
	private ArrayList<Veiculo> veiculos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Patio> patios;
	private String placa, nomePatio, nomeCliente;
	private Scanner sc = new Scanner(System.in);
	boolean achou;
	

	
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
					String codigoCliente = sc.nextLine();
					boolean teste = true;
					int cod = 0;
					do {
						
						System.out.println("Digite o c�digo do cliente");
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
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
