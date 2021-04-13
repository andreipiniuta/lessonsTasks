package Task1D;

public class Task1D {
     public static void main(String[] args) {
        double x=14.26;
        double y=-1.22;
        double z=3.5*0.01;
        double a=1;
        double b=2;
        double c=3;
        double M=2*Math.cos(x-b/c);
        double P=a/b+Math.sin(y)*Math.sin(y);
        double R=1+z*z/(3-z*z/5);
        System.out.println("s="+M/P*R);
    }
}
