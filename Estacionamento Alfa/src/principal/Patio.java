package principal;

public class Patio {
	String nome, logradouro, numero, bairro, municipio, estado, cep;
	int capacidadeDeVeiculos, lotacao;
	float valorDaDiaria;
	
	public Patio(String nome, String logradouro, String numero, String bairro, String municipio, String estado,
			String cep, int capacidadeDeVeiculos, int lotacao, float valorDaDiaria) {
		super();
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.cep = cep;
		this.capacidadeDeVeiculos = capacidadeDeVeiculos;
		this.lotacao = lotacao;
		this.valorDaDiaria = valorDaDiaria;
	}
	
	public Patio() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getCapacidadeDeVeiculos() {
		return capacidadeDeVeiculos;
	}
	public void setCapacidadeDeVeiculos(int capacidadeDeVeiculos) {
		this.capacidadeDeVeiculos = capacidadeDeVeiculos;
	}
	public int getLotacao() {
		return lotacao;
	}
	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
	public float getValorDaDiaria() {
		return valorDaDiaria;
	}
	public void setValorDaDiaria(float valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}
	
	public void imprimir(){
		System.out.println("    **** Pátio : "+ nome + " **** ");
		System.out.println("Capacidade de veiculos: " + capacidadeDeVeiculos);
		System.out.println("Lotação:                " + lotacao);
		System.out.println("Valor da diaria:        " + valorDaDiaria);
		System.out.println("      - Dados de endereço -       ");
		System.out.println("Logradouro: "+ logradouro);
		System.out.println("Numero:     "+ numero);
		System.out.println("Bairro:     "+ bairro);
		System.out.println("Municipio:  "+ municipio);
		System.out.println("Estado:     "+ estado);
		System.out.println("CEP:        "+ cep);
		System.out.println("---------------------------------------");
	}
	
	
	
	
}
