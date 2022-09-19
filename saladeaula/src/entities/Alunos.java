package entities;

public class Alunos {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontosFaltando() {
		if (notaFinal() < 25) {
			return  25 - notaFinal();
		}
		else {
			return 0;
		}
	}

	public String toString() {
		return nome 
				+ ", Nota Final: " + notaFinal() 
				+ ", Pontos faltando: " + pontosFaltando();
	}
}
