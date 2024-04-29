// Binary Search

public class Prtc2 {
    public static int binarySearch(int number[],int key,int start,int end){
    int mid=(start+end)/2;
        if(start<=end){
            if(number[mid]==key){
            return mid;
        }
        else if(number[mid]>key){
            return binarySearch(number, key, start, mid-1);
        }
        else if(number[mid]<key){
            return binarySearch(number, key, mid+1, end);
        }
        }
        return -1;
        
    }
    
    public static void main(String[] args) {
        int number[]={12,23,34,45,56,67,78,89};
        int key=12;
        int start=0,end=number.length-1;
       int result =binarySearch(number, key, start, end);
       if(result!=-1){
        System.out.println(number[result] +" is at index "+result);
       }
       else{
        System.out.println("result does not found");
       }
    }

    
}
