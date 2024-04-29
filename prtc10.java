public class prtc10 {
    public static void transposeOfMatrix(int[][] matrix){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                
                if(matrix[i][j]==7){
                    System.out.println(7+" is at position ("+i+","+j+")");
                }
                
                
                
            }
           
            
        }
        for(int i=0;i<matrix[0].length;i++){
            sum+=matrix[2][i];
        }
        System.out.println("sum of 2nd row is equal to "+sum);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
      int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
      transposeOfMatrix(matrix);  
    }
    
}
