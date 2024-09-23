package objekterOgKlasser.firkant;

public class Circle {

    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

   public double circArea(){
        return (Math.PI * (radius * radius));
   }
}
