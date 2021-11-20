package Tasks.Task3;

import java.util.*;

public class Marks {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(s.nextInt());
        }
        System.out.println(list);
        for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
            if (iter.next() < 4) {
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
