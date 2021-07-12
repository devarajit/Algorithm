import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ExtraLongFactorial {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        extraLongFactorials(n);

        bufferedReader.close();
    }

    private static void extraLongFactorials(int n) {
        BigInteger longFactorial=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            longFactorial = longFactorial.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(longFactorial);
    }
}


