package principal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Cliente {

	int codigo;
	LocalDate dataCadastro;
	String nome, logradouro, numero, bairro, municipio, estado, cep, telefone;
	
	public Cliente(int codigo, String nome, String logradouro, String numero, String bairro, String municipio,
			String estado, String cep, String telefone, LocalDate dataCadastro) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
	}
	
	public Cliente() {
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprimir() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Cliente código "+ codigo + " : ");
		System.out.println("Nome: " + nome);
		System.out.println("telefone: "+ telefone);
		System.out.println("Dados de endereço");
		System.out.println("Logradouro: " + logradouro);
		System.out.println("Numero: " + numero);
		System.out.println("Municipio: "+ municipio);
		System.out.println("Data cadastro: "+ dataCadastro.format(formatter));
		
	}
	
}
