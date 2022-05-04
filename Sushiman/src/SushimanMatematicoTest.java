import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

public class SushimanMatematicoTest extends TestCase {

	public void testEhPrimo() {
        // assert statements
        assertTrue(SushimanMatematico.ehPrimo(7));
        assertTrue(SushimanMatematico.ehPrimo(11));
        assertTrue(SushimanMatematico.ehPrimo(71));
        assertTrue(SushimanMatematico.ehPrimo(233));
        assertFalse(SushimanMatematico.ehPrimo(12));		
	}

	public void testGetPrimos() {
		ArrayList<Integer> expectedArray = new ArrayList<Integer>();
		expectedArray.add(2);
		expectedArray.add(3);
		expectedArray.add(5);
		expectedArray.add(7);
		ArrayList<Integer> actualArray = SushimanMatematico.getPrimos(0);
		assertEquals("getPrimos(0) deve retornar os primos de 1 dígito",expectedArray,actualArray);
	}

	public void testGetSuperPrimos() {
		Integer[] expected = {2, 3, 5, 7};
		Integer[] actual = SushimanMatematico.getSuperPrimos(1).toArray(new Integer[0]);
		assertArrayEquals(expected,actual);
	}

}
