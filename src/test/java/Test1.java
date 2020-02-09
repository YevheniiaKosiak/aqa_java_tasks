import lesson1.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Test1 {

    int Minimum = Task1.min(3, 5, 2);

    @Test
    public void min1() {
        int actual = Minimum;
        int expected = 2;
        assertTrue(actual == expected, String.format("Найденное минимальное значение %d должно быть равно " +
                "ожидаемому минимальному значению %d", actual, expected));
    }

    @Test
    public void min2() {
        int actual = Minimum;
        int expected = 3;
        assertFalse(actual == expected, String.format("Найденное минимальное значение %d не должно быть равно " +
                "ожидаемому значению %d", actual, expected));
    }

    @Test
    public void min3() {
        int actual = Minimum;
        int expected = 5;
        assertFalse(actual == expected, String.format("Найденное минимальное значение %d не должно быть равно " +
                "ожидаемому значению %d", actual, expected));
    }

    @Test
    public void min4() {
        int actual = Minimum;
        int expected = 1;
        assertFalse(actual == expected, String.format("Найденное минимальное значение %d не должно быть равно " +
                "ожидаемому значению %d", actual, expected));
    }

}
