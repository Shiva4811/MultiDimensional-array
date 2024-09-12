class TransposeOfMatrix{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] tr=new int[3][3];
        System.out.println("The given matrix is: ");
        for(int[] ele: arr){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The transpose of given matrix is: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                tr[i][j]=arr[j][i];
            }
        }
        for(int[] ele: tr){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}