package pt.upacademy.desafios.desafio1;

public class Desafio {

	int numOfCicles;
	int big3Count = 0;
	int big5Count = 0;
	
	
	public Desafio(int i) {
		this.numOfCicles = i;
	}

	public void run() {
		
		for (int i = 1; i <= numOfCicles; i++) {
			if (i % 5 == 0) {
				big5Count += 1;
			} 
			if (i % 3 == 0) {
				big3Count += 1;
			}
		}
		
	}

	public int getBig3Count() {
		return big3Count;
	}

	public int getBig5Count() {
		return big5Count;
	}

}
