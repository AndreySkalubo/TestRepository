package Tasks.Test;

@FunctionalInterface
interface I {
    String show(String s1, String s2);
}
public class Test1 {
    static String doShow(String s1, String s2) {
        s1 = "aaaa";
        System.out.println(s1 + " " + s2);
        return s1 + " " + s2;
    }
    boolean hackPenthagon() {
        boolean defence = false;
        int security = 0;
        return defence == false || security < 10;
    }

    public static void main(String[] args) {
        I i = Test1::doShow;
        i.show("aaaa", "bbb");
    }
}
