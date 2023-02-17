public class CalcuteG {
    /**
     * @param args
     */
    public static void main(String[] args){
        double gravity = -9.81;//earth's gravity in m.s^
        double fallingTime = 30;

        double initialVelocity = 0.0;
        double finalVelocity = gravity*fallingTime + initialVelocity;

        double initialPosition =0.0;
        double finalPosition =0.5*gravity* Math.pow(fallingTime, 2) + initialVelocity*fallingTime+initialPosition;

        //add the formulas for position and velocity


        System.out.println("The object's position after" + fallingTime + "seconds is" + finalPosition + "m.");
        System.out.println("the object's velocity after" + fallingTime + "seconds is" + finalVelocity + "m/s");
        
        //Add output line for velocity (similar to position)

    }
    public static double multiply(double a, double b){
        return a+b;

    }
    public static void powersquare(double a){
        //method for powering to square
        Math.pow(a, 2);
    }
    public static double sum(double a, double b){
        return a+b;
    }
    //method of printing out a result
    public static void outline(String message,double value){

     System.out.println(message+"" +value);
    }
}
