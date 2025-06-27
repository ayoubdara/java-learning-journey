public class classesAndObject {
     
    public static void main(String[] args) {
        Car c1 = new Car() ; 
        c1.name = "Tesla" ;      
        c1.maxSpeed = 210 ; 
        c1.model =2025  ;
        c1.price = 89778  ;

        System.out.println(c1.name) ;      // tesla 

        c1.steName("kia");
        System.out.println(c1.name) ;  // kia 

        c1.getName() ; // will print nothings without the 
        System.out.println(c1.getName()) ;  // kia 

        c1.setModeL(2013);
        System.out.println(c1.getModel()); // sorry

        c1.setModeL(2015);
        System.out.println(c1.getModel()); //2015

// HERE IS A PROBLEM BECAUSE ITS PUBLIC ANY ONE
// HERE WE USE : acces level modifiers 
//  باش تحمي دات من ا ستعمال الخاطئ
        c1.model=2010 ;
        // System.out.println(c1.getModel()) ; //2010
// غادي نمنع اي عملية  تغير مباشر الى بالعملية 
// من غير عملية :
// set or get 
      Car c2 = new Car() ;
      c2.setPrivateModeL(2019);
      System.out.println( c2.getPrivateModel()) ; //2019
      c2.setPrivateModeL(2013);
      System.out.println( c2.getPrivateModel()) ; //sorry and also i get 0
// and here we do data hidding 
// and we do encapsulation 

        






    }
    
}
