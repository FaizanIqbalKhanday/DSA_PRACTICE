public class Prtc5 {
    public static void bubbleSort(int[] array){
        for(int i=0;i<=array.length-2;i++){
            for(int j=0;j<=array.length-2-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int[] array){
        for (int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] array={5,6,1,8,4 ,3};
        bubbleSort(array);
        printArray(array);
    }
}
