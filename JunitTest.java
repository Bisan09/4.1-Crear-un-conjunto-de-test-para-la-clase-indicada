package TestJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JunitTST.Tests;

class JunitTest {
	private MapService mapService;
	
	@Test
	void testContarPalabras() {
		assertEquals(5, JunitTST.Tests.contarPalabras("Jose Manuel es del Betis"));
		
	}
	
	@Test
	void contarLetrasDiferentes() {
		assertEquals(6, JunitTST.Tests.contarLetrasDiferentes("Josema"));
	}
	
	@Test
	void contarFrecuenciaPalabras() {
		mapService.put("key1", 100);
		assertEquals(2, JunitTST.Tests.contarFrecuenciaPalabras("Casa Casa"));
	}
	
	import static org.junit.jupiter.api.Assertions.*;

	import java.util.Map;
	import java.util.HashMap;

	import org.junit.jupiter.api.Test;

	public class TestsTest {

	    @Test
	    void testContarPalabras() {
	        assertEquals(3, Tests.contarPalabras("Hola mundo Java"));
	        assertEquals(0, Tests.contarPalabras(""));
	        assertEquals(0, Tests.contarPalabras(null));
	        assertEquals(1, Tests.contarPalabras("Único"));
	    }

	    @Test
	    void testContarLetrasDiferentes() {
	        assertEquals(4, Tests.contarLetrasDiferentes("Hola"));
	        assertEquals(0, Tests.contarLetrasDiferentes(""));
	        assertEquals(0, Tests.contarLetrasDiferentes(null));
	        assertEquals(3, Tests.contarLetrasDiferentes("AaaBBbC"));
	    }

	    @Test
	    void testContarFrecuenciaPalabras() {
	        Map<String, Integer> esperado = new HashMap<>();
	        esperado.put("hola", 2);
	        esperado.put("mundo", 1);
	        assertEquals(esperado, Tests.contarFrecuenciaPalabras("Hola mundo hola"));

	        assertTrue(Tests.contarFrecuenciaPalabras("").isEmpty());
	        assertTrue(Tests.contarFrecuenciaPalabras(null).isEmpty());
	    }

	    @Test
	    void testContarFrecuenciaLetras() {
	        Map<Character, Integer> esperado = new HashMap<>();
	        esperado.put('h', 1);
	        esperado.put('o', 2);
	        esperado.put('l', 1);
	        esperado.put('a', 1);
	        assertEquals(esperado, Tests.contarFrecuenciaLetras("Hola o"));

	        assertTrue(Tests.contarFrecuenciaLetras("").isEmpty());
	        assertTrue(Tests.contarFrecuenciaLetras(null).isEmpty());
	    }

	    @Test
	    void testEsPalindroma() {
	        assertTrue(Tests.esPalindroma("Anilina"));
	        assertTrue(Tests.esPalindroma("A Santa at NASA"));
	        assertFalse(Tests.esPalindroma("Hola"));
	        assertFalse(Tests.esPalindroma(""));
	        assertFalse(Tests.esPalindroma(null));
	    }
	}
}