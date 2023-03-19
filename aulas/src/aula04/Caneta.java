package aula04;

public class Caneta {

	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	
	 // método construtor
	public Caneta(String modelo, String cor, float ponta) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public boolean getTampada() {
		return this.tampada;
	}
	public void setTampada(boolean t) {
		this.tampada = t;
	}
	
	
	public void tampar() {
		this.setTampada(true);
	}
	
	public void destampar() {
		this.setTampada(false);
	}
	
	public void status() {
		System.out.println("\nSOBRE A CANETA:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Tampada: " + this.getTampada());
	}

}
