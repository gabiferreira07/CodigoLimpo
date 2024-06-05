package Cod.Limpo;

import java.util.Scanner;

public class JuntaVetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];
		
		//Ler vetor 1 
		for(int i=0; i<2; i++) {
			System.out.println("Informe o "+ (i+1) +"º valor: ");
			a[i] = ler.nextInt();
			c[i] = a[i];
		}
		//Ler vetor 2
		for(int i=0; i<2; i++) {
			System.out.println("Informe o "+ (i+1)  +"º valor: ");
			b[i] = ler.nextInt();	
			c[i+2] = b[i];
		}
		//Juntar vetores
		for(int i=0; i<4; i++) {
			System.out.println(""+ (i+1)  +"º valor informado: " + c[i]);
		}
		ler.close();
	}

}
