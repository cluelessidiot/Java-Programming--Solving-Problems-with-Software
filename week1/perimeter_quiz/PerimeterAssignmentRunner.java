import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        int ct=0;
        for(Point currPt:s.getPoints()){
          ct=ct+1;
        }
        return ct;
    }

    public double getAverageLength(Shape s) {
        double pm=getPerimeter(s);
        double no=getNumPoints(s);
        return pm/no;
    }

    public double getLargestSide(Shape s) {
        double largestSide=0;
        Point prev=s.getLastPoint();
        for(Point curr:s.getPoints()){
          double currDist=prev.distance(curr);
          if(currDist>largestSide){
            largestSide=currDist;
            }
        
        }
        return largestSide;
    }

    public double getLargestX(Shape s) {
        // Put code here
        return 0.0;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        System.out.println((getNumPoints(s)));
        System.out.println("Complete");
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        double avg=getAverageLength(s);
        System.out.println("average Length = " + avg);
        double large=getLargestSide(s);
        System.out.println("largest side ="+ large);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        //pr.getNumPoints();
    }
}
