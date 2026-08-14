public class Task3 {
    public static void main(String[] args) {
        int n = 17;
        boolean isPrime = true;
        
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        System.out.println(isPrime);
    }
}
