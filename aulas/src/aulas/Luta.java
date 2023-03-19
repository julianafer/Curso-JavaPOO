package aulas;

import java.util.Random;

public class Luta {

	// Atributos ---
	
	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Métodos especiais ---
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	// Métodos do objeto ---
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			setAprovada(true);
			setDesafiado(l1);
			setDesafiante(l2);
		} else {
			setAprovada(false);
			setDesafiado(null);
			setDesafiante(null);
		}
	}
	
	public void lutar() {
		
		if (getAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			System.out.println("====== RESULTADO DA LUTA =====");
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor) {
				case 0 : // Empate
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: // Desafiado vence
					System.out.println("Vitoria do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: // Desafiante vence
					System.out.println("Vitoria do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
			System.out.println("==============================");
			
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	}
	
}
