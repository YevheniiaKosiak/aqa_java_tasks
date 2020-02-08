package lesson1;

public class task5 {
    /* Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
     например "Hello world!!!" -> "!!!dlrow olleH" */
    public static void main(String[] args) {
        System.out.println(resFunc("Hello world!!!"));
    }

    public static String resFunc(String phrase) {
        String resStr = "";
        char[] resMass = phrase.toCharArray();
        for (int i = resMass.length-1; i>=0; i--) {
             resStr= resStr + resMass[i];
        }
        return resStr;
    }
}
