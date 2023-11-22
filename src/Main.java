import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    //Часть 2
    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        int clientOS = scanner.nextInt();
        if (clientOS ==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        int clientOS = scanner.nextInt();
        int clientDeviceYear = scanner.nextInt();
        String versionOS = clientDeviceYear < 2015 ?
                "Установите облегченную версию приложения для ":
                "Установите версию приложения для ";
        if (clientOS ==0){
            System.out.println(versionOS + "iOS по ссылке");
        } else {
            System.out.println(versionOS + "Android по ссылке");
        }
    }
    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year < 1584){
            System.out.println("Понятие високосный год введено в 1584 году");
        } else if ((year % 4 ==0) && (year % 100 !=0 || year % 400 ==0)) {
            System.out.printf("%d год является високосным.",year);
        } else {
            System.out.printf("%d год не является високосным.",year);
        }
    }
    public static void task4(){
        int deliveryDistance = 190;
        if( deliveryDistance < 20) {
            System.out.println("Потребуется один день для доставки");
        } else if(deliveryDistance < 60) {
            System.out.println("Потребуется два дня для доставки");
        } else if(deliveryDistance <= 100) {
            System.out.println("Потребуется три дня для доставки");
        } else {
            System.out.println("При удаленности более 100км доставка не производится.");
        }
    }
    public static void task5(){
        int monthNumber = 152;
        String season;
        switch (monthNumber){
            case 1,2,12 :
                season = "Сейчас Зима";
                break;
            case 3,4,5 :
                season = "Сейчас Веснаь";
                break;
            case 6,7,8 :
                season = "Сейчас Лето";
                break;
            case 9,10,11 :
                season = "Сейчас Осень";
                break;
            default:
                season = "В году только 12 месяцев.\n\tВведите число от 1 до 12";
        }
        System.out.println(season);
    }

    //Часть 1
    public static void taskOne(){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if( age >= 18) {
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний",age);
        } else {
            System.out.printf("Если возраст человека равен %d, он не достиг совершеннолетия, нужно немного подождать",age);
        }
    }

    public static void taskTwo(){
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if( temperature <= 5) {
            System.out.printf("На улице %d градусов, нужно надеть шапку",temperature);
        } else {
            System.out.printf("На улице %d градусов, можно идти без шапки",temperature);
        }
    }

    public static void taskThree() {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        if (speed > 60) {
            System.out.printf("Если скорость %d, то придется заплатить штраф", speed);
        } else {
            System.out.printf("Если скорость %d, то можно ездить спокойно", speed);
        }
    }

    public static void taskFour() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if ((age >= 2) && (age<=6)) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад", age);
        } else if ((age >= 7) && (age<=17)) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу", age);
        } else if ((age >= 18) && (age<=24)) {
            System.out.printf("Если возраст человека равен %d, то  его место в университете", age);
        } else {
            System.out.printf("Если возраст человека равен %d, то  работа  ждёт", age);
        }
    }

    public static void taskFive() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age<5) {
            System.out.printf("Если возраст ребенка равен %d, то он не может кататься на аттракционе", age);
        } else if ((age >= 5) && (age<14)) {
            System.out.printf("Если возраст ребенка равен %d, то он может кататься только в " +
                    "сопровождении взрослого. Если взрослого нет, то кататься нельзя.", age);
        } else  {
            System.out.printf("Если возраст ребенка равен %d, то он может кататься без сопровождения взрослого.", age);
        }
    }

    public static void taskSix() {
        Scanner scanner = new Scanner(System.in);

        int leftPlaces = scanner.nextInt();
        if (leftPlaces<=102) {
            if (leftPlaces<60){
                int seating = 102-leftPlaces-(102-60);
                int standingRoom = 102-seating-leftPlaces;
                System.out.printf("В вагоне осталось %d мест, из них сидячих %d, стоячих %d мест"
                        ,102-leftPlaces
                        ,seating
                        ,standingRoom);
            } else {

                System.out.printf("В вагоне осталось %d мест, из них сидячих мест нет, стоячих %d мест"
                        ,102-leftPlaces
                        ,102-leftPlaces);
            }
        } else {
            System.out.println("Мест нет!");
        }
    }

    public static void taskSeven(){
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        if((one > two) &&(one > three)){
            System.out.printf("Число %d наибольшее",one);
        } else if(two > three){
            System.out.printf("Число %d наибольшее",two);
        } else {
            System.out.printf("Число %d наибольшее",three);
        }
    }

}