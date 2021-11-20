package Tasks.Task3;

import java.util.*;

public class Student {
    String name;
    int mark;

    Scanner s = new Scanner(System.in);

    public Student() {
        System.out.println("Enter name");
        this.name = s.nextLine();
        System.out.println("Enter mark");
        this.mark = s.nextInt();
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\nMark: "+this.mark;
    }

    public static void main(String[] args) {
        System.out.println();
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            students.add(new Student());
        }
        for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
            System.out.println(it.next().toString());
        }
        System.out.println();
        for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
            if (it.next().mark < 4) {
                it.remove();
            }
        }
        for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
            System.out.println(it.next().toString());
        }
    }
}
