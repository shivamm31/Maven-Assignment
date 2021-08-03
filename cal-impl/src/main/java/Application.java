import java.util.Scanner;

public final class Application {
    private Application() {
    }

    /**
     * @param args
     */
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(final String[] args) {
        System.out.println("This is a basic calculator");
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        c.add(num1, num2);
        c.sub(num1, num2);
        c.multiply(num1, num2);
        c.divide(num1, num2);
    }

}
