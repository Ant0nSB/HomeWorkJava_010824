import java.util.Scanner;

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму на счету: ");
        int N = scanner.nextInt();

        int days = calculateDaysToWithdrawAll(N);
        System.out.println("Количество дней для снятия всех денег: " + days);
    }

    public static int calculateDaysToWithdrawAll(int N) {
        int days = 0;

        while (N > 1) {
            int maxDivisor = findMaxDivisor(N);
            N -= maxDivisor;
            days++;
        }
        days++; // Последний день для снятия 1 доллара
        return days;
    }

    public static int findMaxDivisor(int N) {
        for (int i = N / 2; i >= 1; i--) {
            if (N % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
