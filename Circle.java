import java.math;
public class Circle {
    private float radius  ;
    private String color  ;

    public void  setRaduis(float r ){
        radius = r ;

    }
      public void  setColor(String s ){
        color = s ;

    }
    public float getRadius(){
        return radius ;

    }
    
    public String getColor(){
        return color ;

    }
    public float getArea(){
        return pow(radius,2) *3.14 ;

    }

}
