public class App {

    public static void main(String[] args) {

        String password = "123456"; // Hardcoded credential (security issue)

        int unusedVariable = 10; // Unused variable

        try {
            int result = divide(10, 0); // Will cause exception
        } catch (Exception e) {
            // Empty catch block (bad practice)
        }

        if (true) { // Always true condition
            System.out.println("This will always run");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
