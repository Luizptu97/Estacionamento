package principal;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		GerenciaCliente gc = new GerenciaCliente(clientes);
		GerenciaVeiculo gv = new GerenciaVeiculo(veiculos);
		int op = 0, opCli;
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
			
			
			op = sc.nextInt();
			
			
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
				
				
			}
			
			}while(op != 0);

		
		
		
	}

}
