public class DeviceChecker {
    public static void main(String[] args) {
        double temperature1 = 99.0;
        double temperature2 = 95.0;

        boolean isDeviceWorking = checkDevice(temperature1, temperature2);
        System.out.println("Работает ли устройство корректно? " + isDeviceWorking);
    }

    public static boolean checkDevice(double temperature1, double temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }
}
