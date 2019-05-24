package principal;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class GerenciaCliente {

	private ArrayList<Cliente> cli;
	private Scanner sc = new Scanner(System.in);
	private int codigo, dia, mes, ano, opc;
	private boolean achou, teste, opr;
	private Cliente cliente;
	private String cod, op;
	private LocalDate data;

	public GerenciaCliente(ArrayList<Cliente> cli) {
		this.cli = cli;

	}

	public void cadastrarCliente() {
		Cliente cliente = new Cliente();
		LocalDate data;

		System.out.println("--------------- Cadastro de Clientes ---------------");
		achou = false;
		do {
			do {
				teste = true;
				System.out.println("Digite o c�digo do cliente");
				String cod = sc.nextLine();
				try {
					codigo = Integer.parseInt(cod);
				} catch (NumberFormatException ex) {
					System.out.println("\n                 ******** ERRO ********                  ");
					System.out.println("                 Apenas n�mero s�o permitidos!!!          \n\n ");
					teste = false;
				}

			} while (!teste);

			Iterator<Cliente> clientesIterator = cli.iterator();
			while (clientesIterator.hasNext()) {
				Cliente it = clientesIterator.next();
				if (it.getCodigo() == codigo) {
					achou = true;
					System.out.println("                 ******** ERRO ********                ");
					System.out.println("           O c�digo do cliente j� est� em uso  ");
				}

			}
			clientesIterator = null;

		} while (achou);

		cliente.setCodigo(codigo);
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(sc.nextLine());
		System.out.println("Digite o telefone do cliente: ");
		cliente.setTelefone(sc.nextLine());
		System.out.println("      Endere�o do cliente       ");
		System.out.println("Digite o logradouro: ");
		cliente.setLogradouro(sc.nextLine());
		System.out.println("Digite o numero: ");
		cliente.setNumero(sc.nextLine());
		System.out.println("Digite o bairro: ");
		cliente.setBairro(sc.nextLine());
		System.out.println("Digite o municipio: ");
		cliente.setMunicipio(sc.nextLine());
		System.out.println("Digite o estado: ");
		cliente.setEstado(sc.nextLine());
		System.out.println("Digite o cep: ");
		cliente.setCep(sc.nextLine());
		do {
			teste = true;
			System.out.println("Data de cadastro do cliente: ");
			System.out.println("Digite o dia");
			dia = sc.nextInt();
			System.out.println("Digite o m�s");
			mes = sc.nextInt();
			System.out.println("Digite o ano");
			ano = sc.nextInt();
			sc.nextLine();
			data = null;
			try {
				data = LocalDate.of(ano, mes, dia);
			} catch (Exception e) {
				System.out.println("     ******* DATA N�O EXISTE **********          ");
				teste = false;
			}
		} while (!teste);

		cliente.setDataCadastro(data);
		cli.add(cliente);
		System.out.println("Cliente adicionado com sucesso!!");
	}

	public void alterar() {
		if (cli == null) {
			System.out.println("******* N�o h� clientes cadastrados ******");
		} else {
			System.out.println(" ----------------------- Altera��o de Cliente -----------------------");
			do {
				achou = false;
				do {
					teste = true;
					System.out.println("        Digite o c�digo do cliente         ");
					System.out.println("       Ou digite '0' para cancelar ");
					cod = sc.nextLine();
					try {
						codigo = Integer.parseInt(cod);
					} catch (NumberFormatException ex) {
						System.out.println("\n                 ******** ERRO ********                  ");
						System.out.println("                 Apenas n�mero s�o permitidos!!!           ");
						teste = false;
					}

				} while (!teste);

				Iterator<Cliente> clientesIterator = cli.iterator();
				while (clientesIterator.hasNext()) {
					Cliente it = clientesIterator.next();
					if (it.getCodigo() == codigo) {
						achou = true;
						cliente = it;
					}

				}
				if (achou == false) {
					if (cod == "0") {
						achou = true;
						System.out.println("Altera��o cancelada");
					} else {
						System.out.println("     N�o localizamos nenhum cliente com esse c�digo :(    ");
					}
				}
				clientesIterator = null;
			} while (!achou);

			if (cod != "0") {
				System.out.println(" ----------------------- Altera��o de Cliente -----------------------");
				do {
					teste = false;
					System.out.println("Digite o novo c�digo do cliente");
					cod = sc.nextLine();
					try {
						codigo = Integer.parseInt(cod);
					} catch (NumberFormatException ex) {
						System.out.println("******** ERRO ******** \n Apenas n�mero s�o permitidos \n\n");
						teste = true;
					}
				} while (teste);
				cliente.setCodigo(codigo);
				System.out.println("Digite o novo nome do cliente");
				cliente.setNome(sc.nextLine());
				System.out.println("Digite o novo telefone");
				cliente.setTelefone(sc.nextLine());
				System.out.println("Digite o novo logradouro");
				cliente.setLogradouro(sc.nextLine());
				System.out.println("Digite o novo n�mero da residencia");
				cliente.setNumero(sc.nextLine());
				System.out.println("Digite o novo bairro");
				cliente.setBairro(sc.nextLine());
				System.out.println("Digite o novo municipio");
				cliente.setMunicipio(sc.nextLine());
				System.out.println("Digite o novo estado");
				cliente.setEstado(sc.nextLine());
				System.out.println("Digite o novo CEP");
				cliente.setCep(sc.nextLine());
				System.out.println("Digite o novo dia de cadastro");
				do {
					teste = true;
					System.out.println("Data de cadastro do cliente: ");
					System.out.println("Digite o dia");
					dia = sc.nextInt();
					System.out.println("Digite o m�s");
					mes = sc.nextInt();
					System.out.println("Digite o ano");
					ano = sc.nextInt();
					sc.nextLine();
					data = null;
					try {
						data = LocalDate.of(ano, mes, dia);
					} catch (Exception e) {
						System.out.println("     ******* DATA N�O EXISTE **********          ");
						teste = false;
					}
				} while (!teste);
				cliente.setDataCadastro(data);
				System.out.println("Cliente alterado com sucesso!");
			}
		}
	}

	public void excluir() {
		if (cli == null) {
			System.out.println("******* N�o h� clientes cadastrados ******");
		} else {
			System.out.println(" ----------------------- Exclus�o de Cliente -----------------------");
			do {
				achou = false;
				do {
					teste = true;
					System.out.println("       Digite o c�digo do cliente que deseja excluir       ");
					System.out.println("               Ou digite '0' para cancelar ");
					cod = sc.nextLine();
					try {
						codigo = Integer.parseInt(cod);
					} catch (NumberFormatException ex) {
						System.out.println("\n                 ******** ERRO ********                  ");
						System.out.println("                 Apenas n�mero s�o permitidos!!!           ");
						teste = false;
					}

				} while (!teste);

				Iterator<Cliente> clientesIterator = cli.iterator();
				while (clientesIterator.hasNext()) {
					Cliente it = clientesIterator.next();
					if (it.getCodigo() == codigo) {
						achou = true;
						cliente = it;
					}

				}
				if (achou == false) {
					if (cod == "0") {
						achou = true;
						System.out.println("Altera��o cancelada");
					} else {
						System.out.println("     N�o localizamos nenhum cliente com esse c�digo :(    ");
					}
				}
				clientesIterator = null;
			} while (!achou);

			if (cod != "0") {
				do {
					cliente.imprimir();
					System.out.println("Deseja realmente excluir esse cliente?");
					System.out.println("     1 - SIM     |      2 - N�O       ");
					
						op = sc.nextLine();
					if (op.equals("1")) {
						cli.remove(cliente);
						System.out.println("Exclus�o realizada com sucesso");
						opr = true;
					} else {
						if (op.equals("2")) {
							System.out.println("Exclus�o cancelada");
							opr = true;
						} else {
							System.out.println(" ************* Opcao inv�lida *************");
						}
					}
				} while (!opr);
			}
		}
	}

	public void relatorio() {
		if (cli.isEmpty()) {
			System.out.println("Nao existem clientes cadastrados no momento");
		} else {
			Iterator<Cliente> clientesIterator = cli.iterator();
			while (clientesIterator.hasNext()) {
				Cliente it = clientesIterator.next();
				it.imprimir();

			}
			clientesIterator = null;
		}
	}

}
