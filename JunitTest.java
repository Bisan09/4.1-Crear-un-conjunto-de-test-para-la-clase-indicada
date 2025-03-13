package TestJunit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class MyString1Test {

    @Test
    void testConstructor() {
        MyString1 myString = new MyString1("Hola mundo mundo");
        assertEquals("Hola mundo mundo", myString.getStr());
        assertEquals(3, myString.getWordCount());
        assertFalse(myString.isPalindrome());
    }

    @Test
    void testContarPalabras() {
        assertEquals(4, MyString1.contarPalabras("Este es un test"));
        assertEquals(0, MyString1.contarPalabras(""));
        assertEquals(0, MyString1.contarPalabras(null));
    }

    @Test
    void testContarLetrasDiferentes() {
        assertEquals(8, MyString1.contarLetrasDiferentes("Hola mundo"));
        assertEquals(0, MyString1.contarLetrasDiferentes(""));
    }

    @Test
    void testContarFrecuenciaPalabras() {
        Map<String, Integer> frecuencia = MyString1.contarFrecuenciaPalabras("Hola que tan tan bien estas?");
        
        assertEquals(1, frecuencia.get("hola")); 
        assertEquals(2, frecuencia.get("tan"));  
        assertEquals(1, frecuencia.get("que"));  
        assertEquals(1, frecuencia.get("bien")); 
        assertEquals(1, frecuencia.get("estas?")); 
    }

    @Test
    void testContarFrecuenciaLetras() {
        Map<Character, Integer> frecuencia = MyString1.contarFrecuenciaLetras("Resulta que es el el que insulta");

        assertEquals(4, frecuencia.getOrDefault('e', 0));  
        assertEquals(3, frecuencia.getOrDefault('s', 0)); 
        assertEquals(3, frecuencia.getOrDefault('u', 0)); 
        assertEquals(3, frecuencia.getOrDefault('l', 0));  
        assertEquals(3, frecuencia.getOrDefault('t', 0));  
        assertEquals(3, frecuencia.getOrDefault('a', 0)); 
        assertEquals(2, frecuencia.getOrDefault('q', 0)); 
        assertEquals(1, frecuencia.getOrDefault('r', 0)); 
        assertEquals(1, frecuencia.getOrDefault('i', 0));  
        assertEquals(1, frecuencia.getOrDefault('n', 0));
    }
    
    @Test
    void testEsPalindroma() {
        assertTrue(MyString1.esPalindroma("Anita lava la tina"));
        assertFalse(MyString1.esPalindroma("Hola mundo"));
    }
}
