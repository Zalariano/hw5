public class Main {
    public static void main(String[] args) {

        int clientOS = 2;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Несовместимая операционная система");}

        int clientOS1 = 2;
        int year1 = 2015;
        int iOS1 = 0;
        int android1 = 1;
        int clientDeviceYear = 2016;
        if (clientOS1 == iOS1) { if (clientDeviceYear >= year1) {
                System.out.println("Установите версию приложения для iOS по ссылке");} else {
                System.out.println("Установите  облегченную версию приложения для iOS по ссылке");}
            } else if (clientOS1 == android1) { if (clientDeviceYear >= year1) {
                System.out.println("Установите версию приложения для Android по ссылке");} else {
                System.out.println("Установите  облегченную версию приложения для Android по ссылке");}
            } else {
            System.out.println("Несовместимая операционная система");
        }

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " год  является високосным");
        } else {
            System.out.println(+year + " год не високосный");
        }

        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет");}

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