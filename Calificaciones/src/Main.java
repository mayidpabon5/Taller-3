import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        System.out.println("Ingrese nota");
        a = scanner.nextInt();

        switch (a) {
            case 1:
            case 2: {
                System.out.println("Su calificación es F");
                break;
            }
            case 3:
            case 4: {
                System.out.println("Su calificación es D");
                break;
            }
            case 5:
            case 6: {
                System.out.println("Su calificación es C");
                break;
            }
            case 7:
            case 8: {
                System.out.println("Su calificación es B");
                break;
            }
            case 9:
            case 10: {
                System.out.println("Su calificación es A");
                break;
            }
            default: {
                System.out.println("Número no válido, por favor verifique");
            }
        }
    }
}