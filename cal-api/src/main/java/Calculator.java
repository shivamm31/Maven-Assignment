public class Calculator {
    /**
     * @param a
     * @param b
     * @return The addition of two number
     */
    public final int add(final int a, final int b) {
        int output = a + b;
        System.out.println("The sum is : " + output);
        return output;
    }

    /**
     * @param a
     * @param b
     * @return The subtraction of two number
     */
    public final int sub(final int a, final int b) {
        int output = a - b;
        System.out.println("The difference is : " + output);
        return output;
    }

    /**
     * @param a
     * @param b
     * @return The multiplication of two number
     */
    public final int multiply(final int a, final int b) {
        int output = a * b;
        System.out.println("The multiplication is : " + output);
        return output;
    }


    /**
     * @param a
     * @param b
     * @return The division of two number
     */
    public final double divide(final double a, final double b) {
        if (b != 0) {
            double output = a / b;
            System.out.println("The division is : " + output);
            return output;
        } else {
            System.out.println("Division is not possible.");
            return 0;
        }
    }
}

