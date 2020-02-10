import lesson1.Task2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test2 {
    String[][] result = Task2.resArray("Evgenia");

    @Test
    public void masLeni() {
        int actual = result.length;
        int expected = 5;
        assertEquals(actual, expected, String.format("Полученное и ожидаемое значение не совпадают"));
    }

    @Test
    public void masLenj() {
        for (int i = 0; i < result.length; i++) {
            int actual = result[i].length;
            int expected = 10;
            assertEquals(actual, expected, String.format("Полученное и ожидаемое значение не совпадают"));
        }
    }

    @Test
    public void elMass() {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                String actual = result[i][j];
                String expected = "Evgenia";
                assertEquals(actual, expected, String.format("Полученное и ожидаемое значение не совпадают"));
            }
        }
    }

}
