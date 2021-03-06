package core;

public class ContaBancaria {
	private int numeroConta;
	private String titular;
	private String cpf;
	private double saldo;
		
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public void depositar (double valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar (double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
		return true;
		}
		return false;
	}
	
	public String mostrarDadosConta () {
		String resultado = "Titular: "+titular+ " - CPF: "+cpf+"\nN�mero da Conta: "+numeroConta+ "\nSaldo: R$ "+String.format("%.2f\n",saldo);
		return resultado;	
	}
	
}
