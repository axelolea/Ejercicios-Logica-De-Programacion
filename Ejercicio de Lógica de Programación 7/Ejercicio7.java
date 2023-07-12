import java.util.Scanner;

public class Ejercicio7 {

    static Scanner sc = new Scanner(System.in);

    static final int totalMinutes = (4 * 60 * 24) + (15 * 60);

    public static void main(String[] args) {

        int day = Ejercicio7.getDay();

        int hours = Ejercicio7.getHour();

        int minutes = Ejercicio7.getMinutes();

        if(day > 5){
            System.out.println("Ya es fin de semana, disfrutalo.");
            return;
        }
        
        if(day == 5 && hours >= 15){
            System.out.println("Ya empezo fin de seman, aprovecha.");
            return;
        }

        int countMinutes = 0;

        countMinutes += (day - 1) * 60 * 24;

        countMinutes += hours * 60;

        countMinutes += minutes;

        System.out.println("Faltan " + (Ejercicio7.totalMinutes - countMinutes) + " para fin de semana.");
        
    }

    static int getHour(){
        int hour;
        System.out.println("Ingresar la hora (Entre 0 y 23):");
        hour = Ejercicio7.sc.nextInt();

        while(!(hour >= 0 && hour <= 23)){
            System.out.println("Ingresar una hora correcta: ");
            hour = Ejercicio7.sc.nextInt();    
        }

        return hour;
    }

    static int getMinutes(){
        int minutes;

        System.out.println("Ingresar los minutos (Entre 0 y 59):");
        minutes = Ejercicio7.sc.nextInt();

        while(!(minutes >= 0 && minutes <= 59)){
            System.out.println("Ingresar los minutos correcto: ");
            minutes = Ejercicio7.sc.nextInt();    
        }

        return minutes;
    }

    static int getDay(){

        int day;

        System.out.println("Ingresar el dia de la semana:");
        Ejercicio7.printDays();
        day = Ejercicio7.sc.nextInt();

        while(!(day >= 1 && day <= 7)){
            System.out.println("Ingresar un dia correcto");
            Ejercicio7.printDays();
            day = Ejercicio7.sc.nextInt();    
        }

        return day;
    }

    static void printDays(){
        System.out.println("1.- Lunes");
        System.out.println("2.- Martes");
        System.out.println("3.- Miercoles");
        System.out.println("4.- Jueves");
        System.out.println("5.- Viernes");
        System.out.println("6.- Sabado");
        System.out.println("7.- Domingo");
    }

}