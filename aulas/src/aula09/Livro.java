package aula09;

public class Livro implements Publicacao {

	// Atributos ---
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// Métodos especiais ---

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	// Métodos do objeto ---

	public String detalhes() {
		return "titulo = " + titulo + "\nautor = " + autor + "\ntotPaginas = " + totPaginas + "\npagAtual = " + pagAtual+ "\naberto = " + aberto + "\nleitor = " + leitor.getNome() + ", " + leitor.getIdade() + " anos do sexo " + leitor.getSexo();
	}

	@Override
	public void abrir() {
		setAberto(true);
	}

	@Override
	public void fechar() {
		setAberto(false);
	}

	@Override
	public void folhear(int p) {
		if (p > totPaginas) {
			setPagAtual(0);
		} else {
			setPagAtual(p);
		}
	}

	@Override
	public void avancarPag() {
		pagAtual++;
	}

	@Override
	public void voltarPag() {
		pagAtual--;
	}
	
}
