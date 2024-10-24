class A {
    public static void rec(int n) {
        if (n <= 10) { // Base case to stop at 10
            System.out.print(n + " ");
            rec(n + 1); // Increment n for the next call
        }
    }

    public static void main(String[] args) {
        rec(1); // Start recursion from 1
    }
}
