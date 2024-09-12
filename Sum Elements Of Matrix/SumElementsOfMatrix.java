class SumElementsOfMatrix{
    public static void main(String[] args) {
            int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
            System.out.println("The matrix is: ");
            for(int[] ele: arr){
                for(int x: ele ){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
            System.out.println("The sum of 2-D array elements is: ");
            int sum=0;
            for(int i=0; i<arr.length;i++){
                for(int j=0; j<arr[0].length; j++){
                  sum+=arr[i][j];
                }
            }
            System.out.println(sum);
    }
}