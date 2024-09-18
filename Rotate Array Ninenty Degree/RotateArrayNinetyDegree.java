class RotateArrayNinetyDegree{
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int m=a.length;
        int n=a[0].length;
        
        
        System.out.println("The matrix a is: ");
        for(int[] ele: a){
            for(int x: ele){
                System.out.print(x+"   ");
            }
            System.out.println();
        }
        int[][] tr=new int[n][m];
        for(int i=0;i<m; i++){
            for(int j=0; j<n; j++){
                tr[j][i]=a[i][j];
            }
        }
        int k=tr[0].length;
        int l=k-1;
            int[][] temp=new int[m][k];
        for(int i=0; i<m; i++){
            for(int j=0; j<n/2; j++){
             temp[i][j]=tr[i][l];
             tr[i][l]=tr[i][j];
             tr[i][j]=temp[i][j];
            }
        }
        System.out.println("The 90 degree clockwise rotate matrix is: ");
        for(int[] ele: tr){
            for(int x: ele){
                System.out.print(x+"   ");
            }
            System.out.println();
        }
    }

}