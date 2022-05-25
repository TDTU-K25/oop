import java.util.ArrayList;

public class TestPoint {

    private static double calculateDistance(Point A, Point B) {
        return Math.sqrt(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2));
    }

    private static boolean isInsideCircle(Point A) {
        Point O = new Point(0, 0);
        if (calculateDistance(O, A) < 1) {
            return true;
        }
        return false;
    }

    public static ArrayList<Point> findPointInsideCircle(ArrayList<Point> pointList) {
        ArrayList<Point> pointInsideCircle = new ArrayList<Point>();
        
        for (Point point : pointList) {
            if(isInsideCircle(point)) {
                pointInsideCircle.add(point);
            }    
        }
        
        return pointInsideCircle;
    }

    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<Point>();
        Point p1 = new Point(0.5, 0.5);
        Point p2 = new Point(0.75, 0.1);
        pointList.add(p1);
        pointList.add(p2);
        pointList.add(new Point(3, 4));
        pointList.add(new Point(0,1));

        System.out.println(findPointInsideCircle(pointList));
    }
}
