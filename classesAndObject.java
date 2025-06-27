
public class classesAndObject {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tesla";
        c1.maxSpeed = 210;
        c1.model = 2025;
        c1.price = 89778;

        System.out.println(c1.name);      // tesla 

        c1.steName("kia");
        System.out.println(c1.name);  // kia 

        c1.getName(); // will print nothings without the 
        System.out.println(c1.getName());  // kia 

        c1.setModeL(2013);
        System.out.println(c1.getModel()); // sorry

        c1.setModeL(2015);
        System.out.println(c1.getModel()); //2015

// HERE IS A PROBLEM BECAUSE ITS PUBLIC ANY ONE
// HERE WE USE : acces level modifiers 
//  باش تحمي دات من ا ستعمال الخاطئ
        c1.model = 2010;
        // System.out.println(c1.getModel()) ; //2010
// غادي نمنع اي عملية  تغير مباشر الى بالعملية 
// من غير عملية :
// set or get 
        Car c2 = new Car();
        c2.setPrivateModeL(2019);
        System.out.println(c2.getPrivateModel()); //2019
        c2.setPrivateModeL(2013);
        System.out.println(c2.getPrivateModel()); //sorry and also i get 0
// and here we do data hidding 
// and we do encapsulation 

        Circle cricle = new Circle();
        cricle.setRaduis(3);
        cricle.setColor("black");

        double result = cricle.getArea();
        double result2 = cricle.getCirucumference();

        System.out.println(result);
        System.out.println(result2);

        System.out.println(cricle.getColor());
        System.out.println(cricle.ToString());

        BankAccount account1 = new BankAccount();
        account1.insert(4451238, "mohamed", 10000);
        account1.deposit(12000);
        account1.withDraw(2000);
        account1.checkBalance();
        account1.toString();

        BankAccount account2 = new BankAccount();
        account2.insert(4451238, "ahmeed", 500);
        account2.deposit(550);
        account2.withDraw(10);
        account2.checkBalance();
        account2.ToString() ;


         BankAccount acount3 = new BankAccount();
        acount3.insert(9563145, "bilal", 100);
        acount3.deposit(50);
        acount3.withDraw(140);
        acount3.checkBalance();
        acount3.toString();

    }

}
