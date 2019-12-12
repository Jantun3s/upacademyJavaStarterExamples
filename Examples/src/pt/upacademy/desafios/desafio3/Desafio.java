package pt.upacademy.desafios.desafio3;

public class Desafio {
	
	
	
	
	public static int points(String[] strings) {
		int score = 0;
		
		for (int i = 0; i < strings.length; i++) {
				if ((int)strings[i].charAt(0) > (int)strings[i].charAt(2)) {
					score += 3;
				} else if ((int)strings[i].charAt(0) == (int)strings[i].charAt(2)) {
					score += 1;
				}
		}
		return score;
	}

}
