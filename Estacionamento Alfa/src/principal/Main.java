package principal;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		ArrayList<Patio> patios = new ArrayList<>();
		ArrayList<Conta> contas = new ArrayList<>();
		GerenciaCliente gc = new GerenciaCliente(clientes);
		GerenciaVeiculo gv = new GerenciaVeiculo(veiculos);
		GerenciaPatio gp = new GerenciaPatio(patios);
		GerenciaConta gco = new GerenciaConta(contas, veiculos, clientes, patios);
		int op = 0, opCli, opPat, opConta;
		String OPS;
		boolean teste = false;
		Scanner sc = new Scanner(System.in);

		do {
			do {
				teste = false;
				System.out.println("~~~~~~~~~~|Menu Principal|~~~~~~~~~~");
				System.out.println("1 - Clientes");
				System.out.println("2 - Patios");
				System.out.println("3 - Veiculos");
				System.out.println("4 - Conta");
				System.out.println("0 - Sair");
				OPS = sc.nextLine();
				try {
					op = Integer.parseInt(OPS);
				} catch (NumberFormatException ex) {
					System.out.println("******** ERRO ******** \n Apenas número são permitidos \n\n");
					teste = true;
				}
			} while (teste);
			switch (op) {
			case 1:
				do {
					System.out.println("~~~~~~~~~~|Menu Clientes|~~~~~~~~~~");
					System.out.println("1 - Cadastrar cliente");
					System.out.println("2 - Alterar cliente");
					System.out.println("3 - Excluir cliente");
					System.out.println("4 - Relatório");
					System.out.println("0 - Voltar");
					opCli = sc.nextInt();
					sc.nextLine();
					switch (opCli) {
					case 1:
						gc.cadastrarCliente();
						break;
					case 2:
						gc.alterar();
						break;
					case 3:
						gc.excluir();
						break;
					case 4:
						gc.relatorio();
						break;
					case 0:
						System.out.println("\n");
						break;
					default:
						System.out.println(" ****** Opcao inválida ***** ");
						break;
					}

				} while (opCli != 0);

				break;

			case 2: // PATIOS
				do {
					System.out.println("~~~~~~~~~~|Menu Patios|~~~~~~~~~~");
					System.out.println("1 - Cadastrar patio");
					System.out.println("2 - Alterar patio");
					System.out.println("3 - Excluir patio");
					System.out.println("4 - Relatório");
					System.out.println("0 - Voltar");
					opPat = sc.nextInt();
					sc.nextLine();
					switch (opPat) {
					case 1:
						gp.cadastrarPatio();
						break;
					case 2:
						gp.alterar();
						break;
					case 3:
						gp.excluir();
						break;
					case 4:
						gp.relatorio();
						break;
					case 0:
						System.out.println("\n");
						break;
					default:
						System.out.println(" ****** Opcao inválida ***** ");
						break;
					}
				} while (opPat != 0);

				break;
			case 3: // VEICULOS
				do {
					System.out.println("~~~~~~~~~~|Menu Veiculos|~~~~~~~~~~");
					System.out.println("1 - Cadastrar veiculo");
					System.out.println("2 - Alterar veiculo");
					System.out.println("3 - Excluir veiculo");
					System.out.println("4 - Relatório");
					System.out.println("0 - Voltar");
					opCli = sc.nextInt();
					sc.nextLine();
					switch (opCli) {
					case 1:
						gv.cadastrarVeiculo();
						break;
					case 2:
						gv.alterar();
						break;
					case 3:
						gv.excluir();
						break;
					case 4:
						gv.relatorio();
						break;
					case 0:
						System.out.println("\n");
						break;
					default:
						System.out.println(" ****** Opcao inválida ***** ");
						break;
					}
				} while (opCli != 0);

				break;
			case 4: // CONTA
				do {
					System.out.println("~~~~~~~~~~|Menu Contas|~~~~~~~~~~");
					System.out.println("1 - Cadastrar conta");
					System.out.println("2 - Excluir conta");
					System.out.println("3 - Incrementar diárias de uma conta");
					System.out.println("4 - Pagar conta");
					System.out.println("5 - Relatório");
					System.out.println("0 - Voltar");
					opConta = sc.nextInt();
					sc.nextLine();
					switch (opConta) {
					case 1:
						gco.cadastrarConta();
						break;
					case 2:
						gco.excluirConta();
						break;
					case 3:
						gco.incrementaDiarias();
						break;
					case 4:
						gco.pagaDiarias();
						break;
					case 5:
						gco.relatorio();
						break;
					case 0:
						System.out.println("\n");
						break;
					default:
						System.out.println(" ****** Opcao inválida ***** ");
						break;
					}
				} while (opConta != 0);
				break;
			case 0:
				System.out.println("\n");
				break;
			default:
				System.out.println(" ****** Opcao inválida ***** ");
				break;
			}

		} while (op != 0);

	}
}
