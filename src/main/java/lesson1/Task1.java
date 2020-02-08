package lesson1;

public class task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел. */
    public static void main(String[] args) {
        System.out.println(min(9, 18, 4));
    }

    public static int min(int number1, int number2, int number3) {
        if (number1 <= number2 && number1 <= number3) {
            return number1;
        } else if (number2 <= number1 && number2 <= number3) {
            return number2;
        } else
            return number3;
    }

}
