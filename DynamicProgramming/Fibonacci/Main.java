import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> memo=new HashMap<Integer,Integer>();
        System.out.println(FibonacciMemorization.fibMemo(10, memo));
        System.out.println(FibonacciTabulation.fibTab(10));
    }
}
