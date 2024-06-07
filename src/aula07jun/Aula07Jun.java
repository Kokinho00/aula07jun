package aula07jun;

import java.util.Scanner;

public class Aula07Jun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int posicao= -1;
		
		int vet[] = {2,5,1,3,4,9,7,8,10,6};
	
		
		System.out.println("Digite o número que voce deseja encontrar: ");
		
		int resposta = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			
			if (resposta == vet[i]) {
				posicao = i;
				
			}
			
		}	if (posicao == -1) {
			System.out.println("O número " + resposta + " não foi encontrado " );
			
		}	else {
			System.out.println("O número 5"+ resposta + " esta localizado na posição:" + posicao);
			
		}
			
		
		
		
	}

}
