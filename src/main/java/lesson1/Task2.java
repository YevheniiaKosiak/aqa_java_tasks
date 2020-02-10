package lesson1;

public class Task2 {
       /* Мое имя
    Вывести на экран свое имя 5 строк по 10 раз (через пробел).
    System.out.println, System.out.print можно использовать только по одному разу
    для этого нужно воспользоваться циклом for */
    public static void main(String[] args) {
        String[][] arr = resArray("Evgenia");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static String[][] resArray(String args) {
        String[][] array = new String[5][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=args;
            }
        }
        return array;
    }
}