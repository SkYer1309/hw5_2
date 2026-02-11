
public class Main {
    public static void main(String[] args) {
        byte clientOS = 0;
        System.out.println("\n Задание 1");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке:");
        }
        System.out.println(" \n Задание 2");
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке:");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android  по ссылке:");
        }
        System.out.println(" \n Задание 3");

    }
}