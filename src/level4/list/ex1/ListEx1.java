package level4.list.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i);
        }

        double avg = (double) sum / students.size();
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
