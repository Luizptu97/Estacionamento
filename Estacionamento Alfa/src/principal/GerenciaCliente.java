package principal;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class GerenciaCliente {

	
	private ArrayList<Cliente> cli;
	private Scanner sc = new Scanner(System.in);
	private int codigo;
	private boolean achou, teste;
	

	public GerenciaCliente(ArrayList<Cliente> cli) {
		this.cli = cli;
		
	}
	
	
	
	public void cadastrarCliente() {
		Cliente cliente = new Cliente();
		int dia, mes, ano;
		LocalDate data;
		
		System.out.println("--------------- Cadastro de Clientes ---------------");
		achou = false;
		do {
		do {
			teste = true;
			System.out.println("Digite o código do cliente");
			String cod = sc.nextLine();
		try{
			codigo = Integer.parseInt(cod); 
	   		}catch(NumberFormatException ex){
			System.out.println("\n                 ******** ERRO ********                  "); 
			System.out.println("                 Apenas número são permitidos!!!           ");
			teste = false;
       		}
		
		}while(!teste);
		
		Iterator<Cliente> clientesIterator = cli.iterator();
        while (clientesIterator.hasNext()){
               Cliente it = clientesIterator.next();   
               if(it.getCodigo() == codigo) {
            	   achou = true;
            	   System.out.println("                 ******** ERRO ********                ");
            	   System.out.println("           O código do cliente já está em uso  ");
               }  
               
        }
        clientesIterator = null;
        
        
		}while(achou);
       
		cliente.setCodigo(codigo);
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(sc.nextLine());
		System.out.println("Digite o telefone do cliente: ");
		cliente.setTelefone(sc.nextLine());
			System.out.println("      Endereço do cliente       ");
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
			
					System.out.println("Data de cadastro do cliente: ");
					System.out.println("Digite o dia");
					dia = sc.nextInt();
					System.out.println("Digite o mês");
					mes = sc.nextInt();
					System.out.println("Digite o ano");
					ano = sc.nextInt();
					sc.nextLine();
					data = LocalDate.of(ano, mes, dia); 
					cliente.setDataCadastro(data);
					cli.add(cliente);
        }
		
	
	
	
	
	
	
	public void relatorio() {
		if(cli.isEmpty()) {	
			System.out.println("Nao existem clientes cadastrados no momento");
		}else {
		 Iterator<Cliente> clientesIterator = cli.iterator();
         while (clientesIterator.hasNext()){
                Cliente it = clientesIterator.next();   
                it.imprimir();
                
                
         }
         clientesIterator = null;
		}
	}
	
	
	
	
	
	
}
