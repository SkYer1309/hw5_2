
public class Main {
    public static void main(String[] args) {
        byte clientOS = 1;

        System.out.println("\n Задание 1");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке:");
        }
        System.out.println(" \n Задание 2");
        short clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        } else {
            System.out.println("Установите версию приложения для " + (clientOS == 0 ? "iOS" : "Android")
                    + " по ссылке:");
        }
        System.out.println(" \n Задание 3");
        int year = 2004;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println(" \n Задание 4");
        short deliveryDistance = 60;
        byte deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            return;
        }
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Доставка займет дней: " + deliveryDays);
        System.out.println(" \n Задание 5");
        byte monthNumber = 13;
        if (monthNumber > 0 && monthNumber <= 12) {
            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println(monthNumber + "-й месяц принадлежит к сезону ЗИМА");
                    break;
                case 3, 4, 5:
                    System.out.println(monthNumber + "-й месяц принадлежит к сезону ВЕСНА");
                    break;
                case 6, 7, 8:
                    System.out.println(monthNumber + "-й месяц принадлежит к сезону ЛЕТО");
                    break;
                case 9, 10, 11:
                    System.out.println(monthNumber + "-й месяц принадлежит к сезону ОСЕНЬ");
                    break;
            }
        }
    }
}
