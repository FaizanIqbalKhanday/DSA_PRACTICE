import java.util.ArrayList;

public class Prtc34 {
    public static boolean monotonic(ArrayList<Integer> list){
        if (list == null || list.size() <= 1) {
            return true;
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                isDecreasing = false;
            }
            if (list.get(i) < list.get(i - 1)) {
                isIncreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(monotonic(list));

    }
}
