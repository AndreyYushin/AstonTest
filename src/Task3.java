import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите в строку a: ");
        String a = scanner.nextLine();
        System.out.println("Введите в строку b: ");
        String b = scanner.nextLine();

        if(Objects.equals(a, b)){
            System.out.println("Введенные вами данные идентичны");
        } else{
            System.out.println("Введенные вами данные неидентичны");
        }
    }
}
