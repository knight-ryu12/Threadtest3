import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

/**
 * Created by chroma on 16/02/19.
 */
public class Main {

    public static void main(String[] args) throws Throwable{
        String str,str2 = "ABC";
        long long1;
        long long_ago_far_far_away = 4;
        short short1;
        int int1;
        byte bytes[] = new byte[20];
        float float1;
        double double1;
        int literal = 0;
        SecureRandom random = new SecureRandom();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Threads thread = new Threads("t1");
        Runnable runnable = () -> System.out.println("Test lambda thing");
        Runnable runnable1 = () -> System.out.println(123);
        Object object = (Runnable & Serializable & Cloneable) () -> System.out.println("abc");
        IntBinaryOperator op = Integer::sum;
        Consumer<String> c = s -> System.out.println(s);
        IntSupplier supplier = str2::length;
        ToIntFunction<String> f = String::length;
        BiFunction<List<String>, String, Boolean> BiFunction = (list,s) -> list.add(s);
        List<String> list = new ArrayList<>();
        BiFunction.apply(list,"abc");
        int n = f.applyAsInt("abc");

        random.nextBytes(bytes);
        for(int i = 0;i<=bytes.length-1;i++) {
            System.out.println(bytes[i]);
        }
        runnable.run();
        str = buf.readLine();
        System.out.println(str);
        thread.run();
        System.out.println(runnable1 instanceof Runnable);
        System.out.println(runnable1 instanceof Serializable);
        runnable1.run();
        System.out.println(object instanceof Runnable);
        System.out.println(object instanceof Cloneable);
        System.out.println(object instanceof Serializable);
        System.out.println(supplier.getAsInt());
        c.accept("abc");
        System.out.println(op.applyAsInt(1,2));
        System.out.println(n);
        System.out.println(list);
        literal += 0x77;
        literal = literal + supplier.getAsInt();
        System.out.println(literal);
    }
}
