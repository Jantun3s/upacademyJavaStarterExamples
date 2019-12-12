package pt.upacademy.desafios.desafio4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DesafioTest {

	@Test
	void test1() {
		assertArrayEquals(new int[]{1,2,3,4}, Desafio.ints("1 2 3 4"));
		//recebe uma string de numeros separados por espaco e devolve array de ints.
	}
	
	@Test
	void test2() {
		assertArrayEquals(new int[]{1,3,4}, Desafio.ints("1 q2 3 4"));
		
		// Se ele nao poder ser convertido todo para numerico entao e para esquecer, por exemplo o q2
	}
	
	@Test
	void test3() {
		assertArrayEquals(new int[]{}, Desafio.ints(""));
	}
	
	@Test
	void test4() {
		assertArrayEquals(new int[]{1,2,3}, Desafio.ints("Ze 1,2 1 2 3"));
	}

}
