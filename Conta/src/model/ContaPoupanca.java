package model;

public class ContaPoupanca extends ContaBancaria{
	private double taxaRendimento;
	public ContaPoupanca(int senha, int taxa) {
		super(senha);
		this.taxaRendimento = taxa;
	}
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	@Override
	public String toString() {
		return super.toString()+" ContaPoupanca [taxaRendimento=" + taxaRendimento + "]";
	}
	@Override
	public String sacar(double valor) {
		if(this.saldo < valor){
			return "Valor informado maior que o saldo";
		}
		this.setSaldo(super.getSaldo() - valor);
		return "Saque realizado com sucesso";
		
	}
	@Override
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo()+valor);
		
	}
	
	
	
	
	

}
