import java.util.Scanner;

import entities.Alunos;
import entities.Funcionario;
import entities.Retangulo;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Retangulo ret = new Retangulo();
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		ret.v = sc.nextInt();
		ret.h = sc.nextInt();
		System.out.println("AREA: " + ret.area());
		System.out.println("PERIMETRO: " + ret.perimetro());
		System.out.println("DIAGONAL: " + ret.diagonal());
		
		
		Funcionario fun = new Funcionario();
		
		System.out.println("   ");
		System.out.print("Nome do funcionario: ");
		fun.nome = sc.next();
		System.out.print("Salario bruto: ");
		fun.salarioBruto = sc.nextDouble();
		System.out.print("Impostos: ");
		fun.imposto = sc.nextDouble();
		System.out.println("Funcionario" + fun);
		System.out.print("Qual porcentagem aumentara no salario ");
		double porcentagem = sc.nextDouble();
		fun.addSlario(porcentagem);
		System.out.println("Dados atualizados: " + fun);
		
		
		Alunos aluno = new Alunos();
		
		
		System.out.println("   ");
		System.out.print("Qual o nome dos aluno? ");
		aluno.nome = sc.next();
		System.out.println("Informe a primeira nota ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Informe a terceira ");
		aluno.nota3 = sc.nextDouble();
		if (aluno.notaFinal() < 25) {
			System.out.println("Aluno REPROVADO");
		}
		else {
			System.out.println("PARABENS ALUNO APROVADO");
		}
		
		System.out.println(aluno);
		
		sc.close();
	}

}
