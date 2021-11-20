package Tasks.Test;

public class Main {
    public static void main(String[] args) {
        Secondary s = new Secondary();
        System.out.println(s.x);
    }
}
class Secondary {
    protected int x, y;
}