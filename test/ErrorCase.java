public class ErrorCase {
    public void test() {
        TestObject object = new TestObject();

        object.name = "test";  // get or set string value

        try { // in try
            object.id = 100L;  // get or set long value
            String name = object.name;  // get or set string value
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    static class TestObject {
        public Long id;
        public String name;
    }
}

