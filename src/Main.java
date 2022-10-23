// задача 1
public class Main {
    public static void main(String[] args) {
        int year = 2004;
        calculatedLeapYear(year);

    }

    public static void calculatedLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}
// задача 2
/*public class zadacha2 {
    public static void main(String[] args) {
        int year = 2012;
        int oS = 0;
        proverka(year, oS);
    }

    public static void proverka(int year, int oS) {
        if (oS > 0) {
            if (year > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        if (oS == 0) {
            if (year > 2015) {
                System.out.println("Установите версию приложения для iOs по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOs по ссылке");
            }
        }
    }
}
// задача 3
public class zadacha3 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        System.out.println(dostavka(deliveryDistance));


    }
    public static int dostavka (int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay ++;
        }
        if (deliveryDistance > 60) {
            deliveryDay ++;
        }
        if (deliveryDistance >120) {
            deliveryDay ++;
        }
        return deliveryDay;
    }
}
 */
