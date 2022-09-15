package controller;

public class Soma extends Thread {
		private int linha;
		private int[] vetor;
		
		public void Main(int linha, int[] vetor) {
			this.linha = linha;
			this.vetor = vetor;
		}
		public void run() {
			 int soma = 0;
			 for(int i=0; i < vetor.length; i++) 
				 soma += vetor[i];
			 System.out.println("Linha " + linha + " - Soma: " + soma);
		}
	}
