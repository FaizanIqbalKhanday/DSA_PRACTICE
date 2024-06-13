// maximumWaterContainer problem using Bruteforce
import java.util.ArrayList;

public class Prtc31 {
    public static int maxWater=Integer.MIN_VALUE;
    public static void waterContainer(ArrayList<Integer> heights){
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
        waterContainer(list);

    }
}
