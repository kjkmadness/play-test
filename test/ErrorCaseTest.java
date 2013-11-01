import org.junit.*;

public class ErrorCaseTest {
    @Test
    public void test1() throws ClassNotFoundException {
        Class.forName("ErrorCase");
    }

    @Test
    public void test2() throws ClassNotFoundException {
        Class.forName("NoTryCatch");
    }

    @Test
    public void test3() throws ClassNotFoundException {
        Class.forName("UseGetSetMethod");
    }
}

