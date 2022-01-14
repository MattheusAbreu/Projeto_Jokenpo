package br.com.projeto_jokenpô.beans;

import java.util.Scanner;

import br.com.projeto_jokenpô.utils.Execucao;
import br.com.projeto_jokenpô.utils.Menu;

public class Main {

	
	
	public static void main(String[] args) {
		 int vitoriasJogador=0;
		 int vitoriasCPU=0;
		Scanner scanner = new Scanner(System.in);
		
		int opcaoEscolhida=-1;
		
		while(opcaoEscolhida!=3) {
			
		Menu.menuPrincipal();
		opcaoEscolhida=scanner.nextInt();
		
		if(opcaoEscolhida==1) {
			
			Menu.menuEscolhas();
			
			System.out.print("Digite sua escolha: ");
			int opcaoEscolha=scanner.nextInt();
			int i=0;
			
			 i=Execucao.escolhas(opcaoEscolha);
		
			
			if(i==1) {
			
				vitoriasJogador=vitoriasJogador+1;
				}
			else if(i==0)
			{
				vitoriasCPU=vitoriasCPU+1;
			}
			
			
			
			continue;
			
		}
		
		else if(opcaoEscolhida==2) {
			
			System.out.println("Pontuação do Jogador: "+vitoriasJogador);
			System.out.println("Pontuação do CPU    : "+vitoriasCPU);
			continue;
			
		}
		else if(opcaoEscolhida==3) {
			
			System.exit(0);
			break;
		}
		
		
		
		
		}
		
		scanner.close();		
	}
	
	
}
