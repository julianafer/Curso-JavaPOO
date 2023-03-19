package aula09;

public class Pessoa {

	// Atributos ---
	
	private String nome;
	private int idade;
	private String sexo;
	
	// Métodos especiais ---
	
	public Pessoa(String nome, int idade, String sexo) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// Métodos do objeto ---
	
	public void fazerAniver() {
		idade++;
	}
	
}
