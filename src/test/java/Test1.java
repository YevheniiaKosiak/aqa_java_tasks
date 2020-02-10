import lesson1.Task1;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;

        import static org.testng.Assert.*;

public class Test1 {

    @Test(dataProvider = "provider")
    public void min(int value1,int value2,int value3, int expected, String str) {
        int actual = Task1.min(value1, value2, value3);
        assertEquals(expected,actual, String.format("Expected  %d to be equal %d", expected, actual));
    }

    @DataProvider(name = "provider")
    public Object[][] provider() {
        return new Object[][]{
                {3,5,2,2, "1-th"},
                {2,3,5,2, "2-th"},
                {5,2,3,2, "3-th"}
        } ;
    }
}
