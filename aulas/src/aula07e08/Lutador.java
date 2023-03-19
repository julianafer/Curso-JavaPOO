package aula07e08;

public class Lutador {

	// Atributos ---
	
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;
	
	// Métodos especiais ---
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		setNome(nome);
		setNacionalidade(nacionalidade);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		setVitorias(vitorias);
		setDerrotas(derrotas);
		setEmpates(empates);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (getPeso() >= 52.2 && getPeso() <= 70.3) {
			categoria = "Leve";
		} else if (getPeso() <= 83.9) {
			categoria = "Medio";
		} else if (getPeso() <= 120.2) {
			categoria = "Pesado";
		} else {
			categoria = "Invalido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	// Métodos do objeto ---
	
	public void apresentar() {
		System.out.println("---------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
		System.out.println("Diretamente de " + getNacionalidade());
		System.out.println("Com " + getIdade() + " anos e " + getAltura() + " metros");
		System.out.println("Pesando " + getPeso() + " Kg");
		System.out.println(getVitorias() + " vitorias");
		System.out.println(getDerrotas() + " derrotas");
		System.out.println(getEmpates() + " empates");
	}
	
	public void status() {
		System.out.println(getNome() + " eh um peso " + getCategoria());
		System.out.println("Ganhou " + getVitorias() + " vezes");
		System.out.println("Perdeu " + getDerrotas() + " vezes");
		System.out.println("Empatou " + getEmpates() + " vezes");
	}
	
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
	
}
