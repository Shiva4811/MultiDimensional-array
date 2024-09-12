class LargestTwoDimArray{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The matrix is: ");
        for(int[] ele: arr){
            for(int x: ele ){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println("The largest 2-D array element is: ");
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length; j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}