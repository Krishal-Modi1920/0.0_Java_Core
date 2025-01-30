class method_overloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        method_overloading calc = new method_overloading();

        System.out.println("Sum of 3 and 4: " + calc.add(3, 4));  // Output: 7

        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));  // Output: 6

        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));  // Output: 6.0
    }
}
