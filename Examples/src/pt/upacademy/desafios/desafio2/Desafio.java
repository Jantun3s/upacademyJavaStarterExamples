package pt.upacademy.desafios.desafio2;


import java.util.Arrays;
import java.util.Comparator;

public class Desafio {

	public static String order(String string) {
		
			String[] strArray = string.split(" ");
			
//			Arrays.sort(strArray, new Comparator<String>() {
//			public int compare(String str1, String str2) {
//				String a = str1.replaceAll("\\D+", "");
//				String b = str2.replaceAll("\\D+", "");
//		        return Integer.parseInt(a) - Integer.parseInt(b);
//			}
//			});
//			
//			String string1 = String.join(" ", strArray);
//			System.out.println(string1);
			
			Arrays.sort(strArray, Comparator.comparingInt(a -> Integer.parseInt(a.replaceAll("\\D+", ""))));
			String string1 = String.join(" ", strArray);

			
		return string1;
	}

	

}
