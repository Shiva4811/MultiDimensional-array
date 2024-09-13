class TransposeOfMatrix{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int m=arr.length;
        int n=arr[0].length;
        int[][] tr=new int[n][m];
        System.out.println("The given matrix is: ");
        for(int[] ele: arr){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The transpose of given matrix is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){ 
                tr[i][j]=arr[j][i];
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
    }
}