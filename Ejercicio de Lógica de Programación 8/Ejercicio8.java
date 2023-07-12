import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
    	int[] listNumbers = new int [10];
    	
    	int aux;
    	
    	for(int i = 0; i < 10; i++) {
    		
    		System.out.print("Ingrese el numero " + (i + 1) + " : ");
    		aux = sc.nextInt();
    		
    		listNumbers[i] = aux;
    		
    	}
    	
    	int[] newList = new int [10];
    	int pos = 0;

    	for(int i = 0; i < 10; i++){
    		
    		aux = listNumbers[i];
    		
    		if(Ejercicio8.isPrime(aux)) {
    			newList[pos] = aux;
    			pos++;
    		}
    		
    	}
    	
    	for(int i = 0; i < 10; i++){
    		
    		aux = listNumbers[i];
    		
    		if(!Ejercicio8.isPrime(aux)) {
    			newList[pos] = aux;
    			pos++;
    		}
    		
    	}
    	
    	for(int num: newList) {
    		System.out.println(num);
    	}
        
    }
    
    
    static boolean isPrime(int num) {
    	
    	if(num == 1) return false;
    	
    	if (num == 2 || num == 3) return true;
    	
    	for(int i = 2; i <= num / 2; i++)
    		if(num % i == 0) return false;
    	
    	return true;
    }
    
}
