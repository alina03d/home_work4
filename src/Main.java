public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();

    }

    public static void Task1(){
        System.out.println("Задача№1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установить версию приложения для IOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    public static void Task2(){
        System.out.println("Задача№2");
        int clientOS = 1;
        int clientDeviceYear = 2012;
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установить версию приложения для IOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 1 ) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");}

    }


    public static void Task3(){
        System.out.println("Задача№3");
        int year = 2006;
        if (year%4 == 0 && year%100 !=100){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void Task4(){
        System.out.println("Задача№4");
        int deliveryDistance = 19;
        if (deliveryDistance <= 20){
            System.out.println("Потредуется 1 день");}
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется 2 дня");}
        if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется 3 дня");}
        if (deliveryDistance > 100){
            System.out.println("Потредуется больше 4 дней");}
    }
    public static void Task5(){
        System.out.println("Задача№5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Времена года закончились)");

        }
}
}
