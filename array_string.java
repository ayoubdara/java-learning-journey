
public class array_string {

    public static void main(String args[]) {

        //   اد كان يتشارك نفس قيمة 
        // يتشارك نفس مكان نفس ميموري  ولا يحجز نفس  ميموري
        //   this methds call String constant pool  
        String str1 = "hello";  
        String str2 = "hello";
        str1 = "AAAAA";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1);
        /* 
        compare by ASC code 
        A start = 65 
        a = 98
         * s1>s2 = +num
         * s1<s2 = -num 
         * s1 = s2 = 0 
         */
        String s1 = "ABCD"; //D = 68
        String s2 = "ABCe"; // e=101
        System.out.print(s1.compareTo(s2)); // 98-101=-33 

// WHEN Its FIND VALUE DIFRENT VALUE STAR COMPARE AND CALC THE DIFFRENCE IN ASC2
        String s3 = "ABCD"; //A = 65
        String s4 = "BBCe"; // B=66
        System.out.print(s3.compareTo(s4)); // 65-66=-1

//VALUE OF CONVERT ANY DATA TYPE TO STRING 
        int n = 10;
        String s5 = String.valueOf(n);
//Also THIS METHOD CONVERT TO STRING          
        String s6 = n + "";
        System.out.println(s5);

// 
        String s7 = "HELLO";
        String s8 = "HELLO";
        System.out.println(s7 == s8); // true because have the same adress 

        String s9 = new String("HELLO");
        String s10 = new String("HELLO");


        // false  because  new create a new adress and == equal bu refrence (adress)
        System.out.println(s9 == s10); //false 
        System.out.println(s9.equals(s10)); //true its equal by value  ans senstive 
        s9 = s10 ;
        System.out.println(s9 == s10); //true because we assgned the them the same refrence  


        // thie methos compare no senstive case  
        //    s9.equalsIgnoreCase(s10) ;

// this method replace 
        System.out.println(s7.replace("H", "yy")); //sensetive 
// THIS METHOD CHECK IF CARCTERE EXIST IN STRING 
        System.out.println(s7.contains("H")); //true 
        System.out.println(s7.contains("U")); //false 
//This METHOD CHECK THE END 
        System.out.println(s7.endsWith("o")); // false and sensetive 
        System.out.println(s7.endsWith("O")); // true and sensetive 
//This METHOD CHECK THE Start 
        System.out.println(s7.startsWith("o")); // false and sensetive 
        System.out.println(s7.startsWith("H")); // false and sensetive 
// THIS METHOD RESPONSBLE ON CUT THE CUT THE STRING 
        System.out.println(s7.substring(2)); // out put llo
        System.out.println(s7.substring(2,4)); // out put ll













    }

}
