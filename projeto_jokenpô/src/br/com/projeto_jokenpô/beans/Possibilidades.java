package br.com.projeto_jokenpô.beans;

public enum Possibilidades {
	
	PEDRA(1),PAPEL(2),TESOURA(3);
	
	private int id;
	
	Possibilidades(int id){
		this.id=id;
		
	}
	
	
	public int getPossibilidades() {
		
		return this.id;
		
	}
	
	public static Possibilidades converteId(int id) {
		
		if(id==Possibilidades.PEDRA.getPossibilidades()) {
			return Possibilidades.PEDRA;
		}
		
		else if (id==Possibilidades.PAPEL.getPossibilidades()) {
			
			return Possibilidades.PAPEL;
		}
		
	else if (id==Possibilidades.TESOURA.getPossibilidades()) {
			
			return Possibilidades.TESOURA;
		}
	else return null;
		
		
		
		
		
	}
	
	
	

}
