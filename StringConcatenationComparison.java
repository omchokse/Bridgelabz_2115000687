public class StringConcatenationComparison {
    public static void testString() {
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
    }

    public static void testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
    }

    public static void testStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
    }

    public static void main(String[] args) {
        long start, end;

        start = System.nanoTime();
        testString();
        end = System.nanoTime();
        System.out.println("String: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        testStringBuilder();
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        testStringBuffer();
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start) / 1e6 + " ms");
    }
}