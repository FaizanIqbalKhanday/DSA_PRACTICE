public class Prtc18 {
    public static void mergSort(String[] array, int start, int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergSort(array, start, mid);
        mergSort(array, mid+1, end);
        merg(array, start,mid, array.length-1);

    }
    public static void print(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void merg(String[] array, int start, int mid,int end ){
        String temp[]= new String[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while (i <=mid && j<=end) {
            if(array[i].compareTo(array[j])<0){
                temp[k]=array[i];
                i++;
            }
            else{
                temp[k]=array[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=array[i++];
        }
        while (j<=end) {
            temp[k++]=array[j++];
        }
        for(k=0,i=start;i<temp.length;k++,i++){
            array[i]=temp[k];
        }
    }
    
    public static void main(String[] args) {
       String[] array ={"sun","earth","mars","mercury"};
        mergSort(array, 0, array.length-1);
        print(array);
        
    }
    
}
