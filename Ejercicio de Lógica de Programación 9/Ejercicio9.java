import java.util.HashMap;
import java.util.Scanner;


class Ejercicio9{
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
		
		System.out.println("Ingresar el valor a traducir: ");
		String value = sc.nextLine();
		
		if(traductor.containsKey(value)) {
			System.out.println(value + ": " + traductor.get(value));
		}
		else {
			System.out.println("Favor de conectarse a internet.");
		}
		
	}
}