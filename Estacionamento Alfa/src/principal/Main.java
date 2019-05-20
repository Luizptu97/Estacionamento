package principal;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		GerenciaCliente gc = new GerenciaCliente(clientes);
		int op, opCli;
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
			case 2:
				
				
				break;
			case 3:
				
				break;
			}
		}while(op != 0);
		
		
		
		
	}

}
