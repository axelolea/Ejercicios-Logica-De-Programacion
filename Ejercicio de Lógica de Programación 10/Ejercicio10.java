import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class Ejercicio10 {
	
	static final Random ranNum = new Random();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> traductor = new HashMap<>();
		
		traductor.put("mascara", "mask");
		traductor.put("telefono", "phone");
		traductor.put("raton", "mouse");
		traductor.put("tarea", "task");
		traductor.put("computadora", "computer");
		traductor.put("libro", "book");
		traductor.put("carro", "car");
		traductor.put("agua", "water");
		traductor.put("grande", "big");
		traductor.put("raiz", "root");
		traductor.put("madre", "mother");
		traductor.put("pelo", "hair");
		traductor.put("verde", "green");
		traductor.put("solido", "solid");
		traductor.put("trabajo", "work");
		traductor.put("cubeta", "bucket");
		traductor.put("diamante", "diamond");
		traductor.put("luz", "light");
		traductor.put("verdad", "trust");
		traductor.put("estilo", "style");

		String[] keys = new String[traductor.size()];
		
		var selectWords = new HashSet<String>();
		
		traductor.keySet().toArray(keys);
		
		int aux;
		
		while(selectWords.size() < 5) {
			aux = Ejercicio10.random(0, keys.length - 1);
			selectWords.add(keys[aux]);
		}
		
		int points = 0;
		String auxWord;
		
		for(String word: selectWords) {
			
			System.out.println("Ingrese la palabra en ingles de " + word + ": ");
			
			auxWord = sc.nextLine();
			
			if(auxWord.equals(traductor.get(word)))
				points++;
		}
		
		System.out.println("Numero de aciertos: " + points);
		
	}
	
	static int random(int min, int max) {
		return Ejercicio10.ranNum.nextInt(max - min + 1) + min;
	}

}