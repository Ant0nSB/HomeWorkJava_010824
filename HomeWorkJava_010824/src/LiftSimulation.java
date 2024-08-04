import java.util.Scanner;

public class LiftSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту здания (H): ");
        int H = scanner.nextInt();

        System.out.print("Введите количество этажей, на которое поднимается лифт за раз (N): ");
        int N = scanner.nextInt();

        System.out.print("Введите количество этажей, на которое опускается лифт за раз (M): ");
        int M = scanner.nextInt();

        int lifts = numberOfLifts(H, N, M);
        System.out.println("Количество подъемов лифта: " + lifts);
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int currentFloor = 0;
        int lifts = 0;

        while (currentFloor < floor) {
            currentFloor += stepUp;
            lifts++;
            if (currentFloor >= floor) {
                break;
            }
            currentFloor -= stepDown;
        }
        return lifts;
    }
}
