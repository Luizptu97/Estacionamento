package principal;

import java.util.*;

public class GerenciaPatio {

	private ArrayList<Patio> patios;
	private boolean teste, opr;
	private String nome, OPCAO, stringTeste;
	private Scanner sc = new Scanner(System.in);
	private int intTeste;
	private float floatTeste;
	private Patio patio;

	public GerenciaPatio(ArrayList<Patio> patios) {
		this.patios = patios;
	}
	
	
	public void cadastrarPatio() {
		do {
			teste = false;
			System.out.println("Informe o nome do p�tio ");
			nome = sc.nextLine();
			for (Patio p : patios) {
				if(p.getNome().equalsIgnoreCase(nome)) {
					teste = true;
					}
				}
			if(teste) {
				System.out.println(" ** J� POSSUI UM P�TIO COM ESSE NOME EM NOSSO SISTEMA ** ");
				System.out.println("*Digite 0 para sair ou qualquer outro digito para tentar novamente*");
				 OPCAO = sc.nextLine();
				if(OPCAO == "0") {
				teste = false;	
				}
			}
		}while(teste);
		if(OPCAO.equals("0")) {
			System.out.println("Cadastro cancelado");
				
			}else {
			Patio patio = new Patio();
			patio.setNome(nome);
			System.out.println("Digite a capacidade de ve�culos do p�tio");
			stringTeste = sc.nextLine();
						try{
							intTeste=Integer.parseInt(stringTeste); 
					   		}catch(NumberFormatException ex){
					   		System.out.println("             **************** ERRO FATAL ****************             ");
							System.out.println("Esper�vamos um numero inteiro. A capacidade de ve�culos foi definida \n"
								+              "   para o padr�o '20'. Voc� pode alterar mais tarde se necess�rio.	  \n\n");
							intTeste = 20;
							
			           		}
			patio.setCapacidadeDeVeiculos(intTeste);
							do {
								teste = true;
							System.out.println("Digite o valor da di�ria do p�tio");
							stringTeste = sc.nextLine();
							try{
								floatTeste = Float.parseFloat(stringTeste); 
						   		}catch(NumberFormatException ex){
						   		System.out.println("             **************** ERRO FATAL ****************             ");
								System.out.println(" 				Por favor, insira um numero real.                     ");
								teste = false;
				           		}
							}while(!teste);
			patio.setValorDaDiaria(floatTeste);
			System.out.println("    Informa��es de endere�o do patio:   ");
			System.out.println("Informe o logradouro: ");
			patio.setLogradouro(sc.nextLine());
			System.out.println("Informe o n�mero");
			patio.setNumero(sc.nextLine());
			System.out.println("Informe o bairro");
			patio.setBairro(sc.nextLine());
			System.out.println("Informe o municipio");
			patio.setMunicipio(sc.nextLine());
			System.out.println("Informe o estado");
			patio.setEstado(sc.nextLine());
			System.out.println("Informe o CEP");
			patio.setCep(sc.nextLine());
			patios.add(patio);
		}
		}
	
	public void alterar() {
		System.out.println("      -------------Altera��o de Patio-----------          ");
		do {
			teste = false;
			System.out.println("Informe o nome do p�tio ");
			nome = sc.nextLine();
			for (Patio p : patios) {
				if(p.getNome().equalsIgnoreCase(nome)) {
					patio = p;
					teste = true;
					}
				}
			if(!teste) {
				System.out.println("               ** N�o h� um patio com esse nome **                ");
				System.out.println("*Digite 0 para sair ou qualquer outro digito para tentar novamente*");
				 OPCAO = sc.nextLine();
				if(OPCAO.equals("0")) {
				teste = true;	
				}
			}
		}while(teste);
		if(OPCAO.equals("0")) {
			System.out.println("\n                 Alte��o Cancelada                      \n");
		}else {
			System.out.println("      -------------Altera��o de Patio-----------          ");
			System.out.println("Digite o novo nome do p�tio: ");
			patio.setNome(sc.nextLine());
			System.out.println("Digite o novo logradouro: ");
			patio.setLogradouro(sc.nextLine());
			System.out.println("Digite o novo numero");
			patio.setNumero(sc.nextLine());
			System.out.println("Digite o novo bairro");
			patio.setBairro(sc.nextLine());
			System.out.println("Digite o novo munic�pio");
			patio.setMunicipio(sc.nextLine());
			System.out.println("Digite o novo estado");
			patio.setEstado(sc.nextLine());
			System.out.println("Digite o novo CEP");
			patio.setCep(sc.nextLine());
			do {
				teste = false;
				System.out.println("Digite a nova capacidade de ve�culos");
				stringTeste = sc.nextLine();
				try{
					intTeste = Integer.parseInt(stringTeste); 
			   		}catch(NumberFormatException ex){
					System.out.println("******** ERRO ******** \n Apenas n�mero s�o permitidos \n\n");
					teste = true;
	           		}
			}while(teste);
			patio.setCapacidadeDeVeiculos(intTeste);
				do {
					teste = true;
				System.out.println("Digite o novo valor da di�ria do p�tio");
				stringTeste = sc.nextLine();
				try{
					floatTeste = Float.parseFloat(stringTeste); 
			   		}catch(NumberFormatException ex){
			   		System.out.println("             **************** ERRO FATAL ****************             ");
					System.out.println(" 				Por favor, insira um numero real.                     ");
					teste = false;
	           		}
				}while(!teste);
			patio.setValorDaDiaria(floatTeste);
		}
	}
	
	public void excluir() {
		System.out.println("      -------------Exclus�o de Patio-----------          ");
		do {
			teste = false;
			System.out.println("Informe o nome do p�tio ");
			nome = sc.nextLine();
			for (Patio p : patios) {
				if(p.getNome().equalsIgnoreCase(nome)) {
					patio = p;
					teste = true;
					}
				}
			if(!teste) {
				System.out.println("               ** N�o h� um patio com esse nome **                ");
				System.out.println("*Digite 0 para sair ou qualquer outro digito para tentar novamente*");
				 OPCAO = sc.nextLine();
				if(OPCAO.equals("0")) {
				teste = true;	
				}
			}
		}while(teste);
		if(OPCAO.equals("0")) {
			System.out.println("\n                 Exclus�o Cancelada                      \n");
		}else {
			do {
				opr = false;
			System.out.println("      -------------Exclus�o de Patio-----------          ");
			patio.imprimir();
			System.out.println(" ********* Deseja realmente excluir esse p�tio? ********* ");
			System.out.println("           1 - SIM          |      2 - N�O                ");
			OPCAO = sc.nextLine();
			if(OPCAO.equals("1")) {
				patios.remove(patio);
				System.out.println("Exclus�o realizada com sucesso");
				opr = true;
			}else{
				if(OPCAO.equals("2")) {
					System.out.println("Exclus�o cancelada");
				}else {
					System.out.println("            ********Op��o inv�lida ********            ");
				}
			}
		}while(opr);
		}
	}
	
	
	
	
	
	public void relatorio(){
		Iterator<Patio> it = patios.iterator();
		Patio p;
		
		if(patios.isEmpty()) {	
			System.out.println("Nao existem patios cadastrados no momento");
		}else {
			while(it.hasNext())
			{	
				p = it.next();
				p.imprimir();
			}
		}	
		p = null;
	}
	}
	
	
	

