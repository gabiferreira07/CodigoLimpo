package Cod.Limpo;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		int senha, tentativa;
		double n1,n2,soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Cadastre uma senha(Apenas números): ");
		senha = ler.nextInt();
		
		System.out.print("Digite um número: ");
		n1 = ler.nextDouble();
		System.out.print("Digite outro número: ");
		n2 = ler.nextDouble();
		soma = n1 + n2;
		
		System.out.print("Digite a sua senha pra desbloquear a soma: ");
		tentativa = ler.nextInt();
		
		if(tentativa == senha) {
			System.out.println("A soma é: " + soma);
		}
		if(tentativa != senha) {
			System.out.println("Erro! Senha inválida!");
		}
		ler.close();
	}

}
