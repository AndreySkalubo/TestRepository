package Tasks.Test;
import java.util.*;

@FunctionalInterface
interface FunctInt {
    void printS(String str);
}

public class Test {
    void printSmth(String printable) {
        System.out.println(printable);
    }

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println(s.nextLine());
        Test t = new Test() {
            @Override
            void printSmth(String smth) {

            }
        };
        FunctInt fi = (st) -> System.out.println("Example "+st);
        fi.printS("Example");
    }
}
