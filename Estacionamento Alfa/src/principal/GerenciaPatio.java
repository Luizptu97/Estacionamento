package principal;

import java.util.*;

public class GerenciaPatio {

	private ArrayList<Patio> patios;
	private boolean teste;
	private String nome, OPCAO, stringTeste;
	private Scanner sc = new Scanner(System.in);
	private int intTeste;
	private float floatTeste;

	public GerenciaPatio(ArrayList<Patio> patios) {
		this.patios = patios;
	}
	
	
	public void cadastrarPatio() {
		do {
			teste = false;
			System.out.println("Informe o nome do pátio ");
			nome = sc.nextLine();
			for (Patio p : patios) {
				if(p.getNome().equals(nome)) {
					teste = true;
					}
				}
			if(teste) {
				System.out.println(" ** JÁ POSSUI UM PÁTIO COM ESSE NOME EM NOSSO SISTEMA ** ");
				System.out.println("*Digite 0 para sair ou qualquer outro digito para tentar novamente*");
				 OPCAO = sc.nextLine();
				if(OPCAO == "0") {
				teste = true;	
				}
			}
		}while(teste);
		if(OPCAO != "0") {
			Patio patio = new Patio();
			patio.setNome(nome);
			System.out.println("Digite a capacidade de veículos do pátio");
			stringTeste = sc.nextLine();
						try{
							intTeste=Integer.parseInt(stringTeste); 
					   		}catch(NumberFormatException ex){
					   		System.out.println("             **************** ERRO FATAL ****************             ");
							System.out.println("Esperávamos um numero inteiro. A capacidade de veículos foi definida \n"
								+              "   para o padrão '20'. Você pode alterar mais tarde se necessário.	  \n\n");
							intTeste = 20;
							
			           		}
			patio.setCapacidadeDeVeiculos(intTeste);
							do {
								teste = true;
							System.out.println("Digite o valor da diária do pátio");
							stringTeste = sc.nextLine();
							try{
								floatTeste = Float.parseFloat(stringTeste); 
						   		}catch(NumberFormatException ex){
						   		System.out.println("             **************** ERRO FATAL ****************             ");
								System.out.println(" 				Por favor, insira um numero real. ");
								teste = false;
				           		}
							}while(!teste);
			patio.setValorDaDiaria(floatTeste);
			System.out.println("    Informações de endereço do patio:   ");
			System.out.println("Informe o logradouro: ");
			patio.setLogradouro(sc.nextLine());
			System.out.println("Informe o número");
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
	
	
	

