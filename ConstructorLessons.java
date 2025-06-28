
public class ConstructorLessons {

    private String name;
    private String description;
    private int quantite;
    private double price;
    private String color;

    // no-arg constructor
    public ConstructorLessons() {
        this.name = "No Name";
        this.description = "No Description";
        this.quantite = 0;
        this.price = 0.0f;
    }

    // parameterized constructor 
    public ConstructorLessons(String n, String d, int q, double p) {
        this.name = n;
        this.description = d;
        this.quantite = q;
        this.price = p;

    }

    public void ToStrings() {
        System.out.println("Name :" + this.name + "\ndescription "
                + this.description + "\nquantite " + this.quantite + "\nPrice " + this.price);
    }
    // deafult constructor
    // if there is no default value in constructor 
    // object  null
    // boolean false
    // short /byte int 0
    // float 0.0f
    // double 0.0d
    // char \u0000
    // long 0L

    // Constructor Chaining :when a const calls another constr os same class then is called
    // const chaining
    
    public ConstructorLessons(String n, String d, int q, double p, String c) {
        this(n, d, q, p);
        this.color = c;
    }
// Part 2 :Copy constr /finalizers vs destructor

    // method 1
    
    // public ConstructorLessons(ConstructorLessons product) {
    //     this.name = product.name;
    //     this.description = product.description;
    //     this.quantite = product.quantite;
    //     this.price = product.price;
    //     this.color = product.color;

    // }

    // method 2
    public ConstructorLessons(ConstructorLessons p2) {
        this (p2.name ,p2.description,p2.quantite , p2.price,p2.color);

    }

    //  using copy constr with chainng constr

    public void setPrice(double price) {
        this.price = price;
    }
    

}
