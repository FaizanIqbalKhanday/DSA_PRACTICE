import java.util.ArrayList;

public class Prtc35 {
    public static void checkLonelyNumber(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (isLonely(list, i)) {
                System.out.println(list.get(i));
            }
        }
    }

    public static boolean isLonely(ArrayList<Integer> list, int index) {
        int current = list.get(index);
        boolean isLonely = true;

        // Check previous element if it exists
        if (index > 0) {
            int prev = list.get(index - 1);
            if (current == prev - 1 || current == prev + 1) {
                isLonely = false;
            }
        }

        // Check next element if it exists
        if (index < list.size() - 1) {
            int next = list.get(index + 1);
            if (current == next - 1 || current == next + 1) {
                isLonely = false;
            }
        }

        return isLonely;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        checkLonelyNumber(list);
    }
}