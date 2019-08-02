package model;

public abstract class ContaBancaria {
	protected int senha;
	protected double saldo;
	protected int numero;
	public ContaBancaria(int senha) {
		this.senha = senha;
		
	}
	
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean alteraSenha (int previewPassword, int newPassword){
		if(previewPassword == this.senha){
			this.senha = newPassword;
			return true;
		}else{
			return false;
		}
	}
	
	public abstract String  sacar (double valor);
	public abstract void deposita(double valor);
	public abstract String tiraExtrato();
	
	
	@Override
	public String toString() {
		return "ContaPoupanca [senha=" + senha + ", saldo=" + saldo + ", numero=" + numero + "]";
	}

}
