class Automorphic1 {
    public static void main(String args[]) {
        int n = 10;
        int digit = 0;
        int t = n;

        // Count number of digits in n
        while (t != 0) {
            digit++;
            t = t / 10;
        }

        int square = n * n;

        // Extract last 'digit' digits from square
        int mod = (int)Math.pow(10, digit);
        int result = square % mod;

        if (n == result) {
            System.out.println(n + " is an Automorphic number");
        } else {
            System.out.println(n + " is NOT an Automorphic number");
        }
    }
}