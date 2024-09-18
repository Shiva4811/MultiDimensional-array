class AddTwoMatrix{
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{1,2,3},{4,5,6},{7,8,9}};
        int[][] c=new int[3][3];
        System.out.println("The matrix a is: ");
        for(int[] ele: a){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        } 
        System.out.println();
        System.out.println("The matrix b is: ");
        for(int[] ele: b){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        } 
        System.out.println("The sum of two matrix is: ");

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The sum of two matrix c is: ");
        for(int[] ele: c){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        } 
    }
}