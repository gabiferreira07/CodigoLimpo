package Cod.Limpo;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		//Variáveis
		double valor;
		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Informe um valor: ");
		valor = ler.nextDouble();
		
		if(valor % 5 == 0) {
			System.out.println("O número "+ valor +" é mútiplo de 5.");
			System.exit(0);
		}
		if(valor % 5 != 0) {
			System.out.print("O número "+ valor +" não é mútiplo de 5.");
		}
		ler.close();
	}

}
