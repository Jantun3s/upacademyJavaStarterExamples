package pt.upacademy.desafios.desafio4;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static int[] ints(String string) {
		String[] array = string.split(" ");
		List<Integer> array2 = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
		if (array[i].matches("^-?\\d+$")){
		array2.add(Integer.parseInt(array[i]));
		}
		}
		int[] array3 = array2.stream().mapToInt(Integer::intValue).toArray();

		// String[] array = string.split(" ");
		// Set<Integer> sete = new HashSet<Integer>();
		// for (int i = 0; i < array.length; i++) {
		// if (array[i].matches("^-?\\d+$")){
		// sete.add(Integer.parseInt(array[i]));
		// }
		// }
		// int[] array2 = sete.stream().mapToInt(Integer::intValue).toArray();
		return array3;
	}

}
