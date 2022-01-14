package br.com.projeto_jokenpô.utils;

import java.util.Random;

import br.com.projeto_jokenpô.beans.Possibilidades;

public class Execucao {
	
	
	
	public static int escolhas(int escolha) {
		Random r = new Random();
		int low = 1;
		int high = 3;
		int escolhaCPU= r.nextInt(high-low) + low;
		
		System.out.println("Jogador jogou: "+Possibilidades.converteId(escolha));
		System.out.println("CPU jogou: "+Possibilidades.converteId(escolhaCPU));
		
		if (Possibilidades.converteId(escolha)==Possibilidades.converteId(escolhaCPU)) {
		
			System.out.println("EMPATE!");
			
		}
		
		else if (Possibilidades.converteId(escolha).equals(Possibilidades.PAPEL) && Possibilidades.converteId(escolhaCPU).equals(Possibilidades.PEDRA)) {			
			System.out.println("Vitória do Jogador!");
			return 1;
			
		}
		else if (Possibilidades.converteId(escolha).equals(Possibilidades.PAPEL) && Possibilidades.converteId(escolhaCPU).equals(Possibilidades.TESOURA)) {			
			System.out.println("Vitória do CPU!");
			return 0;
		}
		
		else if (Possibilidades.converteId(escolha).equals(Possibilidades.PEDRA) && Possibilidades.converteId(escolhaCPU).equals(Possibilidades.PAPEL)) {			
			System.out.println("Vitória do CPU!");
			return 0;
			
		}
		else if (Possibilidades.converteId(escolha).equals(Possibilidades.PEDRA) && Possibilidades.converteId(escolhaCPU).equals(Possibilidades.TESOURA)) {			
			System.out.println("Vitória do Jogador!");
			return 1;
			
		}
		else if (Possibilidades.converteId(escolha).equals(Possibilidades.TESOURA) && Possibilidades.converteId(escolhaCPU).equals(Possibilidades.PEDRA)) {			
			System.out.println("Vitória do CPU!");
			return 0;
		}
		else {
			System.out.println("Vitória do Jogador!");
			return 1;
			
		}
		return -1;
		
	}
	
	
	
	
	
	

}
