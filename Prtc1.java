// linear search :

public class Prtc1 {
    public static int linearSearch( String names[] , String key ){
        for (int i=0;i<names.length;i++){
            if (names[i]==key){
                return i;
            }
    
        }
        return -1;

    }
    public static int smallestElement(int elements[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<elements.length;i++){
            if(elements[i]<smallest){
                smallest=elements[i];
                
            }
            
        }
        return smallest;
    }


    public static void main(String[] args) {
    //    String names[]={"faizan","zeeshan", "khalid", "shaizan"};
    //    //int max=0;
    //    String key ="khalid";
    //   int index= linearSearch(names,key);
    //   if(index==-1){
    //     System.out.println("index not found");
    //   }
    //   else
    //   System.out.println("index of "+key+" is at "+index );
    int elements[]={8,5,1,7,6,11,21,3,9};
    System.out.println("smallest element is "+smallestElement(elements));

    
}
}