public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            System.out.println("установите облегчённую версию приложения ");
        } else {
            System.out.println("установите обычную версию приложения ");
        }
        int year = 2021;
        if(year%4==0 && year%100 !=0 || year%400==0) {
            System.out.println("вискосный");
            } else {
                System.out.println("невискосный");
            }
        int deliveryDistance = 95;
        if (deliveryDistance == 20) {
            System.out.println("Потребуется дней : 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >=60 && deliveryDistance <100) {
            System.out.println("Потребуется дней: 3");
        }
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца нет");

        }
        }
        }


