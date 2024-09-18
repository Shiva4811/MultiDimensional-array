class WaveMatrix{
    public static void show(int [][] arr){
        for(int[] ele: arr){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("The matrix is: ");
        show(arr);
        System.out.println("The result output is: ");
        for(int i=0; i<m; i++){
            if( i%2==0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        
       
        
    }
}