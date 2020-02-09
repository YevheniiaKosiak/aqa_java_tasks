package lesson1;

public class Task4 {
    /* Мое имя
 Вывести на экран свое имя 5 строк по 10 раз (через пробел).
 System.out.println, System.out.print можно использовать только по одному разу
 для этого нужно воспользоваться циклом do () while */
    public static void main(String[] args) {
        String name = "Evgenia";
        int i = 0;
        do {
            int j = 0;
            do {
                j++;
                System.out.print(name + " ");
            } while (j < 10);
            i++;
            System.out.println();
        } while (i < 5);
    }
}
