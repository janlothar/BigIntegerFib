import java.math.BigInteger;

class fib {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.printf("fib(%d)\t= %d\n", n, fibLoop(n));
        // for (int i=0; i<=n; i++) {
        //     BigInteger result = fibLoop(i);
        //     if (result.compareTo(new BigInteger("0")) == -1) break;
        //     System.out.printf("fib(%d)\t= %d\n", i, result);
        // }
    }

    public static BigInteger fibLoop(int n){
        if (n == 0) {
            return new BigInteger("0");
        } else {
            BigInteger[] F = new BigInteger[n+1];
            F[0] = new BigInteger("0");
            F[1] = new BigInteger("1");
            int i = 1;
            while (i < n) {
                F[i+1] = F[i-1].add(F[i]);
                i = i + 1;
            }
            return F[n];
        }
    }
}
