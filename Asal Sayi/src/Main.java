import java.util.Scanner;

public class Main {
    static int isPrime(int a, int b) {
        if (b == 1) {
            return 0;
        }
        if (a % b == 0) {
            return 1;
        } else {
            return isPrime(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int a = input.nextInt();
        int result = isPrime(a, a - 1);
        if (result == 0) {
            System.out.println(a + " asal sayıdır.");
        } else {
            System.out.println(a + " asal sayı değildir.");
        }
    }
}