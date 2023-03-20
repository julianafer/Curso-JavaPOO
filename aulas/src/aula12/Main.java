package aula12;

public class Main {

	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		// Exemplos de polimorfismo
		// m.locomover();
		// r.locomover();
		// p.locomover();
		// a.locomover();
		
		Canguru cg = new Canguru();
		Cachorro ca = new Cachorro();
		Cobra co = new Cobra();
		Tartaruga ta = new Tartaruga();
		Goldfish gf = new Goldfish();
		Arara ar = new Arara();
		
		cg.locomover();
		ca.locomover();
		cg.emitirSom();
		ca.emitirSom();
		
	}

}
