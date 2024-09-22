

class ScoreAfterFlipping{
    public static void show(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
            int[][] arr={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
            System.out.println("The matrix is: ");
            show(arr);
            for(int i=0; i<arr.length; i++){
                if(arr[i][0]==0){
                    for(int j=0; j<arr[0].length; j++){
                        if(arr[i][j]==0) arr[i][j]=1;
                         else arr[i][j]=0;
                    }
                }
            }
            show(arr);
        for(int j=1; j<arr[0].length; j++){
            int NoOfZeroes=0; int NoOfOnes=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i][j]==0) NoOfZeroes++;
                else NoOfOnes++;
            }
            if(NoOfZeroes>NoOfOnes){
                for(int i=0; i<arr.length; i++){
                if(arr[i][j]==0) arr[i][j]=1;
                else arr[i][j]=0;

            }
        }
        }
        System.out.println("The Final matrix after maximize number flipping: ");
        show(arr);
        int score=0;
        int x=1;
        for(int j=arr[0].length-1; j>=0; j--){
            for (int i = 0; i < arr.length; i++) {
                        score+=(arr[i][j]*x);
            }
            x*=2;
        }
        System.out.println("The sum of maximum binary numbers is: "+score);
    }
}