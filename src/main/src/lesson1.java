public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Тест - задание 1: вычисляем a * (b + (c / d)) с a, b, c, d - int & рузультат - double");
        calculate(1, 2, 3, 4);

        System.out.println("Тест - задание 2: сумма двух чисел от 10 до 20 (вкл.)");
        checkSum(6, 4);
        checkSum(19, 1);
        checkSum(11, 5);
        checkSum(7,1);

        System.out.println("Тест - задание 3: положителтное или отрицательное число?");
        checkNumber(-42);
        checkNumber(42);

        System.out.println("Тест - задание 4: приветствие");
        hello("Гарри Поттер");

        System.out.println("Тест - задание 5: високосный или невисокосный?");
        isLeapYear(2020); //div by 4
        isLeapYear(2345); //not div by 4
        isLeapYear(2100); //div by 4 & div by 100 & not div by 400
        isLeapYear(2400); //div by 4 & div by 100 & div by 400
    }


    public static double calculate(int a, int b, int c, int d) {
        double f = ((double) a * ((double) b + ((double) c / (double) d)));
        System.out.println(f);
        return f;
    }


    /**
     * 2) Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
     * от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */
    public static boolean checkSum(int a, int b){
        int sum = a + b;
        if(sum >= 10 & sum <= 20){
            System.out.println( sum + " " + "True!");
            return true;
        } else{
            System.out.println(sum + " " + "False!");
            return false;
        }
    }

    /**
     * 3) Написать метод, которому в качестве параметра передается целое число,
     * метод должен проверить положительное ли число передали, или отрицательное.
     * Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
     */
    public static void checkNumber(int number){
        if(number >= 0){
            System.out.println(number + " " + "Число положительное!");
        } else {
            System.out.println(number + " " + "Число отрицательное!");
        }
    }

    /**
     * 4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
     * метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
     */
    public static void hello(String name){
        System.out.println("Привет, " + name + " !");
    }

    /**
     * 5) Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый 400-й – високосный.
     * Для проверки работы вывести результаты работы метода в консоль
     */
    public static void isLeapYear(int year){
        int y = year % 4;
        int x = year % 100;
        int z = year % 400;

        if(y == 0){ //divisible by 4
            if(x > 0 ){ // not divisible by 100
                System.out.println(year + " високосный год!");
            } else if(x == 0){ //divisible by 100
                if(z == 0){ //divisible by 400
                    System.out.println(year + " високосный год!");
                } else{ //not divisible by 400
                    System.out.println(year + " невисокосный год!");
                }
            }
        } else { //not divisible by 4
            System.out.println(year + " невисокосный год!");
        }
    }
}
