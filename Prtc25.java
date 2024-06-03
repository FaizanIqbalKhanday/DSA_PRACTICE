// check first occurrence of an element by using recursion
public class Prtc25 {
    public  static int firstOccurrence(int[] elements, int index, int key){
        if(index>=elements.length){
            return index;
        }
        if(elements[index]==key){
            return index;
        }
        return firstOccurrence(elements,index+1,key);
    }
    public static void main(String[] args) {
        int[] elements ={1,3,4,5,6,8,5,9};
        System.out.println(firstOccurrence(elements,0,5));

    }
}
