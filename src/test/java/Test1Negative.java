import lesson1.Task1;
import org.testng.annotations.*;

import static org.testng.Assert.assertNotEquals;

public class Test1Negative {

    @BeforeClass
    public void start() {
        System.out.println("=*=*=*=*=*=*=*=*=*=");
    }

    @Test(dataProvider = "provider")
    @Parameters({"value1", "value2", "value3"})
    public void min(@Optional int value1, int value2, int value3, int expected, String str) {
        int actual = Task1.min(value1, value2, value3);
        assertNotEquals(expected,actual, String.format("Expected %d not to be equal %d", expected, actual));
    }

    @DataProvider(name = "provider")
    public Object[][] provider() {
        return new Object[][]{
                {3,5,2,3, "1-th"},
                {3,5,2,5, "2-th"},
                {3,5,2,0, "3-th"},
        } ;
    }
}
