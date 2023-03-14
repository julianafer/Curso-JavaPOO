package aulas;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Métodos especiais
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void estadoAtual() {
		System.out.println("-------------------");
		System.out.println("Conta: " + getNumConta());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Dono: " + getDono());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Status: " + getStatus());
		System.out.println("-------------------");
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	// Métodos da classe
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinehiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois tem débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	
	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada");
		}
	}
	
	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}
	
	public void pagarMensal() {
		int v;
		if (this.getTipo() == "CC") {
			v = 12;
		} else {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada");
		}
	}
	
}
