import java.math.BigInteger;
import java.util.Random;

public class RandomPrimeGenerator {

    public BigInteger generateRandomPrime(int bitLength) {

        BigInteger prime;
        Random random = new Random();

        do {
            prime = new BigInteger(bitLength, random);

            // Make prime odd, always
            prime = prime.setBit(0);

        } while (!isPrime(prime));

        return prime;
    }

    private static Boolean isPrime(BigInteger num) {
        // Return false if num is smaller or equal to 1
        if (num.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        // 100%
        return num.isProbablePrime(100);
    }
}