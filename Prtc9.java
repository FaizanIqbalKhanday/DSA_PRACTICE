public class Prtc9 {
    public static void diagnolSum(int[][] matrix){
        int sum=0, sum1=0,sum2=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum1+=matrix[i][j];
                }

            }
        }
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix[0].length;j++){
                if(i+j==matrix.length-1){
                    sum2+=matrix[i][j];
                    if(i==j){
                        sum2-=matrix[i][j];
                    }
                }
            }
        }
        sum=sum1+sum2;
        System.out.println("sum is equal to : "+sum);

    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 8, 3, 5}, {2, 6, 4, 4}, {5, 9, 7, 3}, {3, 5, 9, 2}};
        int[][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
        diagnolSum(matrix);
        diagnolSum(matrix2);
    }
    
}
