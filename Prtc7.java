

public class Prtc7 {
    public static boolean search(int[][] matrix,int key){
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==key){
                  System.out.println("key is found at ("+i+","+j+") ");
                  return true;  
                }
            }
            

        }
        System.out.println("key not found");
        return false;

    }
    public static void greatestNumber(int[][] matrix){
        int max=matrix[0][0];
    
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){

                    if(matrix[i][j]>max){
                        max=matrix[i][j];
                        


           } 
        }
    }
    System.out.println(max+" is greater");
    }
    public static void smallestNumber(int[][] matrix){
        int min=matrix[0][0];
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i>m;i++){
           for(int j=0;j<n;j++){

                    if(matrix[i][j]>min){
                        min=matrix[i][j];
                        


           } 
        }
    }
    System.out.println(min+" is greater");
    }
    public static void main(String[] args) {
        int[][] matrix={{1,8,3},{2,6,4},{5,9,7}};
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 11);
        greatestNumber(matrix);
        smallestNumber(matrix);
    }
    
}
