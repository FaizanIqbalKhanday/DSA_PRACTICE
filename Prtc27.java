public class Prtc27 {
    public  static void occurrenceOfAnElement(int [] elements, int key, int index){
        if(index>elements.length-1){
            return;
        }
        if(elements[index]==key){
            System.out.print(index+" ");

            occurrenceOfAnElement(elements,key,index+1);

        }
        else{
            occurrenceOfAnElement(elements,key,index+1);

        }
    }
    public static void main(String[] args) {
        int[] elements ={1,3,2,3, 5,3,3};
        occurrenceOfAnElement(elements,3,0);

    }
}
