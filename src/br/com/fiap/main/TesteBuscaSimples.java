package br.com.fiap.main;

public class TesteBuscaSimples {

	public static void main(String[] args) {
		int[] vetor = { 10, 20, 30, 40,50 };
		int alvo = 30;
		int tamanhoVetor = 5;
		
		int i = 0;
		
		for(i = 0; i < tamanhoVetor; i++) {
			if (vetor[i] == alvo) {
				break;
			}
		}
		
		System.out.println("Alvo encontrado na posição " + i);
		System.out.println("Valor do alco encontrado: " + vetor[i]);
	}

}
