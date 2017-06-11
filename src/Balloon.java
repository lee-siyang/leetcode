/**
 * Created by lisiyang on 17/6/11.
 */
/**
 * models a spherical balloon that is being filled with air
 */
public class Balloon
{
    private double volume;
    //private double radius;
    /**
     * Constructor for objects of class Balloon
     */
    public Balloon(){
        this.volume = 0;
        //this.radius = 0;
    }
    /**
     * Add the air into the balloon
     * @param amount The amount of the volume entered in
     */
    public void addAir(double amount){
        volume=amount+volume;
    }
    /**
     * Get the volume in the balloon
     * @return Return the volume in the balloon
     */
    public double getVolume(){
        return volume;
    }
    /**
     * Get the current radius
     * @return Return the current radius
     */
    public double getRadius(){

        //this.radius =
        return Math.pow(volume*3.0/4.0/Math.PI,1.0/3);
    }
    /**
     * Gets the current surface area
     * @return Return the current surface area
     */
    public double getSurfaceArea(){
        return 4.0*Math.PI*Math.pow(getRadius(),2);
    }
     public static void main(String[] args){
         Balloon balloon = new Balloon();
         balloon.addAir(100);
         //double a=Math.sqrt(2);
         String a="City";
         System.out.println(a.length());
         System.out.println(balloon.getRadius());
         System.out.println("expected: 2.8794119114848606");
         System.out.println(balloon.getVolume());
         System.out.println("expected: 100.0");
         System.out.println(balloon.getSurfaceArea());
         System.out.println("expected: 104.18794157356089");

         balloon.addAir(100);
         System.out.println(balloon.getVolume());
         System.out.println("expected: 200.0");
         System.out.println(balloon.getRadius());
         System.out.println("expected: 3.6278316785978095");
         System.out.println(balloon.getSurfaceArea());
         System.out.println("expected: 165.38804805627188");
     }
}
