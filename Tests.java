package TestJunit;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Set;

import java.util.Map;

public class MyString1 {

		private String str;
		
		private int WordCount=0;
		private Integer DistinctChar=0;
		private Map<String, Integer> WordFrecuency = new HashMap<>();
		private Map<Character, Integer> CharFrecuency = new HashMap<>();
		private boolean isPalindrome;
		
public MyString1(String str) {
	this.str = str;
	this.WordCount = MyString1.contarPalabras(this.str);
	this.DistinctChar = MyString1.contarLetrasDiferentes(this.str);
	this.WordFrecuency = MyString1.contarFrecuenciaPalabras(this.str);
	this.CharFrecuency = MyString1.contarFrecuenciaLetras(this.str);
	this.isPalindrome = MyString1.esPalindroma(this.str);
	
}
public boolean getEsPalindroma() {
	return this.isPalindrome;
}

public String getStr() {
	return str;
}
public Integer getWordCount() {
	return WordCount;
}
public Integer getDistinctChar() {
	return DistinctChar;
}
public Map<String, Integer> getWordFrecuency() {
	return WordFrecuency;
}
public Map<Character, Integer> getCharFrecuency() {
	return CharFrecuency;
}
public boolean isPalindrome() {
	return isPalindrome;
}

public static int contarPalabras(String str) {
	if (str == null || str.isEmpty()) {
		return 0;
	}
	String[] palabras = str.split("\\s+");
	return palabras.length;
}
public static int contarLetrasDiferentes(String str) {
    if (str == null || str.isEmpty()) {
        return 0;
    }
    Set<Character> letrasDiferentes = new HashSet<>();
    for (char c : str.toCharArray()) {
        if (Character.isLetter(c)) { 
            letrasDiferentes.add(Character.toLowerCase(c)); 
        }
    }
    return letrasDiferentes.size();
}
public static Map<String, Integer> contarFrecuenciaPalabras(String str) {
    Map<String, Integer> frecuencia = new HashMap<>();
    
    if (str == null || str.isEmpty()) {
        return frecuencia;
    }
    
    String[] frecPalabra = str.toLowerCase().split("\\s+");

    for (String palabra : frecPalabra) {
        frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
    }
    
    return frecuencia; 
}


public static Map<Character, Integer> contarFrecuenciaLetras(String str) {
    Map<Character, Integer> frecuencia = new HashMap<>();
    
    if (str == null || str.isEmpty()) {
        return frecuencia;
    }
    
    for (char c : str.toCharArray()) {
        if (Character.isLetter(c)) { 
            c = Character.toLowerCase(c); 
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }
    }
    
    return frecuencia;
}

public static boolean esPalindroma(String str) {
	if (str == null || str.isEmpty()) {
		return false;
	}
	str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
	int left = 0, right = str.length() -1;
	while (left < right) {
		if (str.charAt(left) != str.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}

}
