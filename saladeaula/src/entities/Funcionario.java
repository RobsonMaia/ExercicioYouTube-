package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public double addSlario(double porcentagem) {
		return salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", salarioLiquido());
	}

}
