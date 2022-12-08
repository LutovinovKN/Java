import java.util.Scanner;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1(){
        System.out.println("Как тебя зовут? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        String res = "";
        if (hour >= 5 && hour < 12){
            res += "Доброе утро, ";
        } else if (hour >= 12 && hour < 18){
            res += "Добрый день, ";
        } else if (hour >= 18 && hour < 23){
            res += "Добрый вечер, ";
        } else {
            res += "Доброй ночи, ";
        }

        System.out.println(res + name);
    }
}