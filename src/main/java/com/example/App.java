public class App {

    public static void main(String[] args) {

        int unused = 10; // Unused variable

        if (true) { // Always true condition
            System.out.println("Always runs");
        }

        String text = null;
        System.out.println(text.length()); // NullPointerException (BUG)

        try {
            int x = 10 / 0; // Runtime error
        } catch (Exception e) {
            // Empty catch block (bad practice)
        }

        for (int i = 0; i < 10; i++) {
        }

        for (int i = 0; i < 10; i++) {
        } // Duplicate code
    }
}
