// remove duplicates from a string using recursion
public class Prtc26 {
    public static void removeDuplicates(String str, int index, StringBuilder newString, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, index + 1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1, newString.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "faizanIqbal".toLowerCase();
        StringBuilder newString = new StringBuilder("");
        boolean[] map = new boolean[26];
        removeDuplicates(str, 0, newString, map);
    }
}

