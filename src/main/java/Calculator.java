
import java.util.Arrays;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int... b) {
        return a + Arrays.stream(b).sum();
    }

}
