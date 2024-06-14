// maximumWaterContainer problem usingArray List
import java.util.ArrayList;

public class Prtc31 {
    // using BrutrForce
    public static void waterContainer(ArrayList<Integer> heights){
        int maxWater=0;
        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j<heights.size();j++){
                int height =Math.min(heights.get(i), heights.get(j));
                int width=j-i;
                int water=height*width;
                maxWater=Math.max(maxWater,water);

            }

        }
        System.out.println("maximum water Contain = "+maxWater);


    }
    // Two Point Approach
    public static void twoPointApproach(ArrayList<Integer> heights){
        int maxi=0,width=0,height=0 ,water=0;
        int leftPoint=0;
        int rightPoint=heights.size()-1;
        while(leftPoint<rightPoint){

            height=Math.min(heights.get(leftPoint),heights.get(rightPoint) );
            width=rightPoint-leftPoint;
            water=height*width;

            maxi=Math.max(maxi,water);
            if(heights.get(leftPoint)<heights.get(rightPoint)){
                leftPoint++;
            }
            else{
                rightPoint--;
            }

        }
        System.out.println("maximum water Contain = "+maxi);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(7);
        System.out.println("using brute force");
        waterContainer(list);
        System.out.println();
        System.out.println("using two point approach");
        twoPointApproach(list);

    }
}
