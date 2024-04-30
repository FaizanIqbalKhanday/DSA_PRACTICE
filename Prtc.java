// check elements appears more than once or not.
public class Prtc {
    public static boolean checkElementsAppearsMoreThanOnce(int[] elements){
        for(int i=0;i<elements.length;i++){
                for(int j=i+1;j<elements.length;j++){
                    if(elements[i] == elements[j]){
                        return true;
                    }
                }
        }


        return false;
    }
    public static void main(String[] args) {
       int[] elements={ 4, 2, 3, 5 ,1};
        System.out.println(checkElementsAppearsMoreThanOnce(elements));
    }
    
}
