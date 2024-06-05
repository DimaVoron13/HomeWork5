public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");

        byte ClientOS = 1;
        short clientDeviceYear = 2014;
        byte IOS = 0;
        byte Android = 1;
        if (ClientOS == IOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ClientOS == IOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (ClientOS == Android && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (ClientOS == Android && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задание 3");

        short year = 800;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Этот год является високосным");
        }else {
            System.out.println("Этот год не является високосным");
        }

        System.out.println("Задание 4");
        short deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Для доставки с расстоянием в " + deliveryDistance + " км, потребуются 1 сутки");
        }else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Для доставки с расстоянием в " + deliveryDistance + " км, потребуется 2 суток");
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Для доставки с расстоянием в " + deliveryDistance + " км, потребуется 3 суток");
        }else{
            System.out.println("Для расстояния в " + deliveryDistance + " км, доставки нет");
        }

        System.out.println("Задание 5");

        int monthNumber = 10;
        switch (monthNumber){
            case 1, 2, 12:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3, 4, 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6, 7, 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9, 10, 11:
                System.out.println("Этот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Данные введены неверно");
            }
        }
    }