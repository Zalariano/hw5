public class Main {
    public static void main(String[] args) {

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите  облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int year = 2021;
        boolean uslovie2 = ((year % 100 == 0) && year % 400 != 0);
        if (year % 4 != 0 || uslovie2) {
            System.out.println(+year + " год не является високосным");
        } else {
            System.out.println(+year + " год високосный");
        }

        int deliveryDistance = 95;
        boolean usl1 = deliveryDistance <= 20;
        boolean usl2 = (deliveryDistance > 20 && deliveryDistance < 60);
        boolean usl3 = (deliveryDistance >= 60 && deliveryDistance <= 100);
        int deliveryTime = 1;
        if (usl1) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (usl2) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (usl3) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {System.out.println("Свыше 100 км доставки нет");}

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц зимнего сезона");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц весеннего сезона");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц летнего сезона");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц осеннего сезона");
                break;
            default:
                System.out.println("такого месяца не существует");

        }
    }
}