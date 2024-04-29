public class Prtc19 {
    public static int countElements(int[] array,int n, int count,int start, int end){
        if(start>=end){
            return 0;
        }
        int mid=start+(end-start)/2;
        countElements(array, n, count, start, mid);
        countElements(array, n, count, mid+1, end);
        int abc =merg(array, n,mid, start, end);
        return abc;
    }
    public static int merg(int[] array,int n,int mid, int start,int end){
        int count = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (array[i] == n) {
                count++;
            }
            i++;
        }
        while (j <= end) {
            if (array[j] == n) {
                count++;
            }
            j++;
        }
        return count;
        
    }
    public static void main(String[] args) {
        int[] array ={3,2,3};
        System.out.println(countElements(array, 3, 0, 0, array.length-1));
        
    }
    
}
