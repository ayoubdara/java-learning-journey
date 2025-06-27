
public class Car {

    String name;
    int maxSpeed;
    float price;
    int model;

    private String prvName;
    private int prvModel;
    private float prvPrice;
    private int prvMaxSpeed;

    void steName(String n) {
        name = n;
        prvName = n ;
    }

    String getName() {
        return name;
    }

    void setModeL(int m) {
        if (m >= 2015) {
            model = m;
        } else {
            System.out.println("sorry");

        }

    }

    public int getModel() {
        return model;
    }

    // this use when use private atrributes
    public void setPrivateName(String n) {
        prvName = n;
    }

    public String getPrivateName() {
        return prvName;
    }

    public void setPrivateModeL(int m) {
        if (m >= 2015) {
            prvModel = m;
        } else {
            System.out.println("sorry");

        }

    }

    public int getPrivateModel() {
        return prvModel;
    }

}
