package model;

public class ContaCorrente extends ContaBancaria {
	private int qtdTransacoesRealizadas;

	public ContaCorrente(int senha, int qtdTransacoesRealizadas) {
		super(senha);
		this.qtdTransacoesRealizadas = qtdTransacoesRealizadas;
	}

	public int getQtdTransacoesRealizadas() {
		return qtdTransacoesRealizadas;
	}

	public void setQtdTransacoesRealizadas(int qtdTransacoesRealizadas) {
		this.qtdTransacoesRealizadas = qtdTransacoesRealizadas;
	}

	@Override
	public String toString() {
		return super.toString()+" ContaCorrente [qtdTransacoesRealizadas=" + qtdTransacoesRealizadas + "]";
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tiraExtrato() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
