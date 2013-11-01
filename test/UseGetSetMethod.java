public class UseGetSetMethod {
    public void test() {
        TestObject object = new TestObject();

        object.setName("test"); // get or set string value

        try { // in try
            object.setId(100L); // get or set long value
            String name = object.getName(); // get or set string value
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    static class TestObject {
        public Long id;
        public String name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}

