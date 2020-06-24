import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FibRecursive {
    static Map<Integer,Integer> fibSet;

    public static void main(String[] args) {
        fibSet =new HashMap<>();
        fibSet.put(0,0);
        fibSet.put(1,1);
        System.out.println(fib(7));

    }

    public static int fib(int n){
        if (fibSet.get(n)==null) {
            fibSet.put(n, fib(n-1)+ fib(n-2));
        }
        return fibSet.get(n);
    }
}
