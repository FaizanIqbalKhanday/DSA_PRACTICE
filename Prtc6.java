public class Prtc6 {
    public static void selectSorting(int[] array){
        for(int i=0;i<=array.length-2;i++){
            int minPos=i;
            for(int j=i+1;j<=array.length-1;j++){
                if(array[minPos]>array[j]){
                    minPos=j;
                }
            }
            int temp=array[minPos];
            array[minPos]=array[i];
            array[i]=temp;
        }
    }
    public static void printArray(int[] array){
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array= {5,6,1,8,4 ,3};
        selectSorting(array);
        printArray(array);
        
    }
    
}
