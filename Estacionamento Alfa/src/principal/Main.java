package principal;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		ArrayList<Patio> patios = new ArrayList<>();
		GerenciaCliente gc = new GerenciaCliente(clientes);
		GerenciaVeiculo gv = new GerenciaVeiculo(veiculos);
		GerenciaPatio gp = new GerenciaPatio(patios);
		int op = 0, opCli, opPat;
		String OPS;
		boolean teste = false;
		Scanner sc = new Scanner(System.in);
		

		do {
			 System.out.println("~~~~~~~~~~|Menu Principal|~~~~~~~~~~");
				System.out.println("1 - Clientes");
				System.out.println("2 - Patios");
				System.out.println("3 - Veiculos");
				System.out.println("4 - Conta");
				System.out.println("0 - Sair");
				OPS = sc.nextLine();
			try{
				op=Integer.parseInt(OPS); 
		   		}catch(NumberFormatException ex){
				System.out.println("******** ERRO ******** \n Apenas número são permitidos \n\n");
				op = 2603;
				continue;
           		}

			switch(op) {
			case 1:
				do {
				 System.out.println("~~~~~~~~~~|Menu Clientes|~~~~~~~~~~");
				 System.out.println("1 - Cadastrar cliente");
				 System.out.println("2 - Alterar cliente");
				 System.out.println("3 - Excluir cliente");
				 System.out.println("4 - Consultar cliente");
				 System.out.println("5 - Relatório");
				 System.out.println("0 - Voltar");
				 opCli = sc.nextInt();
				 sc.nextLine();
				 switch(opCli) {
				 case 1:
					 gc.cadastrarCliente();
					 break;
				 case 5:
					 gc.relatorio();
					 break;
				 }
				}while(opCli != 0);
				
				break;
				
			case 2:  // PATIOS
				do {
					 System.out.println("~~~~~~~~~~|Menu Patios|~~~~~~~~~~");
					 System.out.println("1 - Cadastrar patio");
					 System.out.println("2 - Alterar patio");
					 System.out.println("3 - Excluir patio");
					 System.out.println("4 - Consultar patio");
					 System.out.println("5 - Relatório");
					 System.out.println("0 - Voltar");
					 opPat = sc.nextInt();
					 sc.nextLine();
					 switch(opPat) {
					 case 1:
						 gp.cadastrarPatio();
						 break;
					 case 5:
						 gp.relatorio();
						 break;
					 }
					}while(opPat != 0);
				
				break;
			case 3: // VEICULOS
				do {
					 System.out.println("~~~~~~~~~~|Menu Veiculos|~~~~~~~~~~");
					 System.out.println("1 - Cadastrar veiculo");
					 System.out.println("2 - Alterar veiculo");
					 System.out.println("3 - Excluir veiculo");
					 System.out.println("4 - Consultar veiculo");
					 System.out.println("5 - Relatório");
					 System.out.println("0 - Voltar");
					 opCli = sc.nextInt();
					 switch(opCli) {
					 case 1:
						 gv.cadastrarVeiculo();
						 break;
					 case 5:
						 gv.relatorio();
						 break;
					 }
					}while(opCli != 0);
				
				
				break;
			case 4: // CONTA
				
				break;
			case 2603:
				System.out.println("\n");
				break;
				
				default:
					System.out.println("Opção inválida");
					break;
			
					
			}
			
			}while(op != 0);

		
		
		
	}

}
