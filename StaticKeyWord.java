public class StaticKeyWord {
    int  num ;
    static int  count = 1 ;
    static int  minimalPassword =6 ;

    private  String name ;

    private  String password ;
    private boolean loggedIn = false ;

    // i can access to this variables with key word static any where 
    static String college = "IT" ;

    public StaticKeyWord(String name ) {
        // if not count not static will be the same do add by one 
        this.num = count ;
        this.name = name ;
        count ++ ; 

    }
    public boolean logIn(int enteredNo , String enteredPassword) {
        if (enteredNo == num && enteredPassword.equals(password)) {
            loggedIn = true ; 
            return true ; 
        }else{
            return false ; 
        }
    }
    public static boolean validatePassword(String password){
        if (password.length() >=minimalPassword ) {
            return true ;
            
        }
        return false ;
    }
    public void ToString() {
        System.out.println("num: "+this.num+"\nname "+this.name+"\ncollege "+college);
    }
    
    
}
