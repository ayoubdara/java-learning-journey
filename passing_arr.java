public class passing_arr{
    // static void print(int x []){
    //     for(int i = 0 ; i < x.length ; i++){
    //         System.out.print(x[i]+ " ") ;
    //     }

    // }
    static int [] getArray(){
        // int arr2[] =new int []{44,2,3,4,5,6,7} ;
        // return arr2 ; 
        // return of anymoms array
        return new int []{44,2,3,4,5,6,7} ; 

    }
    public static void main(String[] args) {
        // int []arr = {1,2,3,4};
        // print(arr) ;
        // System.out.println(getArray()) ; i get the adress of array
        // int array2[] = getArray() ;
        // System.out.println(array2[0]);   //out put 44 
        int arr3 [] = {10,20,30} ;
        int arr4 [] = {100,200,300} ;
        int arr5 [] = {1000,2000,3000} ;

        // arr3 =arr4= ; 
        // arr4[0] = 7000 ;
        // arr3[0] = 681 ;

        // System.out.println(arr3[0]);   // 7000 
        // System.out.println(arr4[0]);  // 681 
        // when i do =  will have the same refrence will have the same place 
        // in memorie

        // arr3=arr4=arr5; 
        // System.out.println(arr3[0]);   // 1000 
        // System.out.println(arr4[0]);   // 1000 
        // System.out.println(arr5[0]);   // 1000 
        int x = 7 ;
        int v = 9 ; 
        x=v ; 
        v = 110 ;
        System.out.println(v);   // 110
        System.out.println(x);   // 9





    }
}