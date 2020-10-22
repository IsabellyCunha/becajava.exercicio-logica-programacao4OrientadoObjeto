package baskharaoo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Declaração do leitor das variaveis
		Scanner leitor = new Scanner(System.in);
		
		//criando um objeto para manipular a classe CalculoBaskhara
		CalculoBaskhara calculo = new CalculoBaskhara();
		
		//Inserindo o valor de a dentro da variável importada do objeto
		System.out.print("Digite o valor de a: ");
		calculo.a = leitor.nextDouble();
		
		//Inserindo o valor de b dentro da variável importada do objeto
		System.out.print("Digite o valor de b: ");
		calculo.b = leitor.nextDouble();
		
		//Inserindo o valor de c dentro da variável importada do objeto
		System.out.print("Digite o valor de b: ");
		calculo.b = leitor.nextDouble();
		
		//Chamando os métodos onde estão os calculos 
		calculo.delta();
		
		calculo.x1();
		
		calculo.x2();

	}

}
