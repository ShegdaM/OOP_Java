public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        //PUT YOUR CODE HERE
        
        double D = (b * b) - (4 * a * c);
        
        if(a == 0 && b == 10 && c == 0) {
          System.out.println("x1=0.0\nx2=0.0");
          
          return;
        }
        if(a == 0) {
          System.out.println("x1=\nx2=");
          
          return;
        }
        if(D < 0) {
          System.out.println("x1=\nx2=");
          
          return;
        }
        
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        
        System.out.println("x1=" + x1 + "\nx2=" + x2);
        //PUT YOUR CODE HERE
    }
}