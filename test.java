class test {
    static int fact(int a ) {

        if(a == 0 || a == 1) 
            return 1 ;
        else 
            for (int i = a , i <a ; i--){
                int r = i * a ;
                return r ;

            }
        

    }

    public static void main(String[] args) {
        fact(5);
        // This is a simple Java program that prints "Hello, World!" to the console.
        System.out.println("Hello, World!");
    }
}