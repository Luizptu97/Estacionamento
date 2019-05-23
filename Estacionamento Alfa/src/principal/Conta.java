package principal;

public class Conta {
	
	Veiculo veiculo;
	Cliente cliente;
	Patio patio;
	int diarias, mes, ano;
	
	public Conta(Veiculo veiculo, Cliente cliente, Patio patio, int diarias, int mes, int ano, boolean paga) {
		super();
		this.veiculo = veiculo;
		this.cliente = cliente;
		this.patio = patio;
		this.diarias = diarias;
		this.mes = mes;
		this.ano = ano;
		this.paga = paga;
	}
	
	public Conta() {
		
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Patio getPatio() {
		return patio;
	}
	public void setPatio(Patio patio) {
		this.patio = patio;
	}
	public int getDiarias() {
		return diarias;
	}
	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isPaga() {
		return paga;
	}
	public void setPaga(boolean paga) {
		this.paga = paga;
	}
	boolean paga;
	
	
	
	
	public void imprimir() {
		System.out.println("             Dados da conta             ");
		System.out.println("Veiculo:               " + veiculo.getPlaca());
		System.out.println("Patio  :               " + patio.getNome());
		System.out.println("        Cliente código "+ cliente.getCodigo());
		System.out.println("         Nome:         "+ cliente.getNome());
		System.out.println("Período de referencia: "+ mes + "/" + ano);
		if(paga = true) {
		System.out.println("    $ Conta paga   ");
		}else {
		System.out.println("Ainda há " + diarias + " diarias pendentes aguardando pagamento.");
		}
				
	}
	
	
	
}
