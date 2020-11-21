package paintEstimator;

import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
   public static void main(String[] args) {
       Scanner scnr=new Scanner(System.in);
       double wallHeight;
       double wallWidth;
       double wallArea;

       System.out.println("Enter wall height (feet):");
       wallHeight=scnr.nextDouble();
       System.out.println("Enter wall width (feet):");
       wallWidth=scnr.nextDouble();
       wallArea=wallWidth*wallHeight;
       System.out.println("Wall area: "+wallArea+" square feet");

       double gallons=wallArea/350.0;
       System.out.println("Paint needed: "+gallons+" gallons");
       System.out.println("Cans needed: "+Math.round(gallons)+" can(s)");
   }
}