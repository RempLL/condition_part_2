import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Задача 1");
        System.out.println("Введите индекс операционной системы: ");
        int clientOS = sc.nextInt();
        System.out.println((clientOS==0)?"Установите версию приложения для iOS по ссылке"
                : "Установите версию приложения для Android по ссылке");
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Введите индекс операционной системы: ");
        int clientOS2 = sc.nextInt();
        System.out.println("Введите год операционной системы: ");
        int clientOS2_manufacture = sc.nextInt();
        String tip = (clientOS2==0)?"IOS": "Android";
        String year = (clientOS2_manufacture<2015)?"облегченную":"стандартную";
        System.out.println("Установите "+year+" версию приложения для "+ tip+" по ссылке");
        System.out.println();

        System.out.println("Задача 3");
        System.out.println("Введите год: ");
        int year3 = sc.nextInt();
        if(year3%4!=0 || (year3%100==0 && year3%400!=0)) System.out.println(year3+" не високосный год");
        else System.out.println(year3+" високосный год");
        System.out.println();

        System.out.println("Задача 4");
        System.out.println("Введите расстояние: ");
        int deliveryDistance = sc.nextInt();
        int count = 0;
        if(deliveryDistance<=100) {
            if (deliveryDistance >= 0) count++;
            if (deliveryDistance >= 20) count++;
            if (deliveryDistance >= 60) count++;
            System.out.println("Потребуется дней: " + count);
        }else System.out.println("Доставки нет");
        System.out.println();

        System.out.println("Задача 5");
        int monthNumber = sc.nextInt();
        switch (monthNumber){
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default: System.out.println("Нет такого месяца");
        }
    }
}