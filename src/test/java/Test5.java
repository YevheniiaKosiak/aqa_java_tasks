import lesson1.Task5;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Test5 {
    String Res = Task5.resFunc("Hello world!!!");

    @Test
    public void versa1() {
        String actual = Res;
        String expected = "!!!dlrow olleH";
        assertEquals(actual, expected, String.format("Полученное и ожидаемое значение не совпадают"));
    }

    @Test
    public void versa2() {
        String actual = Res;
        String expected = "!!!dlrow olle";
        assertNotEquals(actual, expected, String.format("Полученное и ожидаемое значение совпадают"));
    }

    @Test
    public void versa3() {
        String actual = Res;
        String expected = "!!dlrow olleH";
        assertNotEquals(actual, expected, String.format("Полученное и ожидаемое значение совпадают"));
    }

    @Test
    public void versa4() {
        String actual = Res;
        String expected = "Hello world!!!";
        assertNotEquals(actual, expected, String.format("Полученное и ожидаемое значение совпадают"));
    }

}