import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        System.out.println("Ingrese a");
        a = scanner.nextInt();
        System.out.println("Ingrese b");
        b = scanner.nextInt();
        System.out.println("Ingrese c");
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("El numero mayor es A  " + "el cual corresponde a  " + a);

        } else if (a > b && c > a) {
            System.out.println("El numero mayor es C  " + "el cual corresponde a  " + c);

        } else if (b > a && b > c) {
            System.out.println("El numero mayor es B  " + "el cual corresponde a  " + b);

        } else if (b > a && c > b) {
            System.out.println("El numero mayor es C  " + "el cual corresponde a  " + c);
        } else {
            System.out.println("Los numeros ingresados deben ser diferentes");
        }
    }
}