
public class Multidimensional_Arrays {
    static void print(int a [][]){
          for (int row = 0; row < a.length; row++) {
            // the output here is 
            // 1 2 3 
            // 1 2 
            // 1 
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println("");

         

    }}
    static int [][] get2DArray(){
        int ar[][] = new int [1][2] ;
        return ar ; 
    }

    public static void main(String args[]) {
        // this equal (chofr) if they have the same col  #
        int arr[][] = new int[3][];
        // you can declare like that 
        // int []arr[] = new int[5][] ; 
        // also like that 
        // int [][] arr= new int[5][] ; 
        // equal this #
        arr[0] = new int[2];
        arr[1] = new int[2];
        arr[2] = new int[2];

        arr[0][0] = 1;
        arr[0][1] = 12;

        arr[1][0] = 2;
        arr[1][1] = 22;

        arr[2][0] = 3;
        arr[2][1] = 32;
        // this equal this $

        int[][] arra2 = new int[][]{
            {1, 2, 3},
            {1, 2},
            {1}
        };
        // this $
        // int[][] arra2 = {{1, 2, 3}, {1, 2}, {1}};
        // System.out.println(arra2.length) ; output number of row
        // System.out.println(arra2[0].length) ; output number of row 0 {3}
        // System.out.println(arra2[1].length) ; output number of row 1 {2}
        // System.out.println(arra2[0].length) ; output number of row 2{1}

        // for (int i = 0 ; i<arra2[0].length ; i++ ) {
        //     // the output its 3 adresse of first row  
        //     // System.out.print(arra2[i]+" ") ;
        //     // the output here is value inside row  is : 1 2 3 
        //     System.out.print(arra2[0][i]+" ") ;  
        // } 


        for (int row = 0; row < arra2.length; row++) {
            // the output here is 
            // 1 2 3 
            // 1 2 
            // 1 
            for (int col = 0; col < arra2[row].length; col++) {
                System.out.print(arra2[row][col] + " ");
            }
            System.out.println("");

        }

        // forach 
        for(int []r:arra2){
            // the output here is 
            // 1 2 3 
            // 1 2 
            // 1 
            for(int c:r){
                System.out.print(c+" ");
            }
            System.out.println("");
        }

        int arra3[][] ={{1,2,3}, {4,5,6} };
        // for(int i = 0 ; i<3 ; i++){   
        //     for(int j=0 ; j<2 ; j ++){ 
        //         System.out.println(arra3[j][i]);
        // the explantation
        //         0 =>1
        //         0 =>4

        //         1 =>2
        //         1 =>5

        //          2=>3
        //          2=>4

        //     }
        // }


        print(arra2);

        get2DArray(arra3) ;


    }

}
