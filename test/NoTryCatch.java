public class NoTryCatch {
    public void test() {
        ErrorCase.TestObject object = new ErrorCase.TestObject();
        object.name = "test";  // get or set string value
        object.id = 100L;  // get or set long value
        String name = object.name;  // get or set string value
    }
}

