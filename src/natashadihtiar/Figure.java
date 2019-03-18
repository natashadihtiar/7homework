package natashadihtiar;

public class Figure {
    Point[] points1;
    Point[] points2;
    Point[] points3;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public Figure() {
    }

    public Figure(String title, Point point0, Point point1, Point point2) {
        this.title = title;
        points1 = new Point[3];
        this.points1[0] = point0;
        this.points1[1] = point1;
        this.points1[2] = point2;
    }

    public Figure(String title, Point point0, Point point1, Point point2, Point point3) {
        this.title = title;
        points2 = new Point[4];
        this.points2[0] = point0;
        this.points2[1] = point1;
        this.points2[2] = point2;
        this.points2[3] = point3;
    }

    public Figure(String title, Point point0, Point point1, Point point2, Point point3, Point point4) {
        this.title = title;
        points3 = new Point[5];
        this.points3[0] = point0;
        this.points3[1] = point1;
        this.points3[2] = point2;
        this.points3[3] = point3;
        this.points3[4] = point4;
    }

    public double CalculateSideLength(Point p1, Point p2) {
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
    }
    public double CalculateSideLength2(Point point1, Point point2) {
        return Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX()) + (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()));
    }
    public double CalculateSideLength3(Point point_1, Point point_2) {
        return Math.sqrt((point_1.getX() - point_2.getX()) * (point_1.getX() - point_2.getX()) + (point_1.getY() - point_2.getY()) * (point_1.getY() - point_2.getY()));
    }

    public String toString()
    {
        String result = "";
        result = this.getTitle();
        for (Point p: points1) {
            result = result + "\n" + p.toString();
        }
        return result;
    }
    public String toString2()
    {
        String result = "";
        result = this.getTitle();
        for (Point p: points2) {
            result = result + "\n" + p.toString();
        }
        return result;
    }
    public String toString3()
    {
        String result = "";
        result = this.getTitle();
        for (Point p: points3) {
            result = result + "\n" + p.toString();
        }
        return result;
    }

    public double CalculatePerimeter1()
    {
        double result = 0;

        for (int i = 0; i <points1.length; i++) {
            result += CalculateSideLength(points1[i], points1[(i+1)%points1.length]);
        }

        return result;
    }
    public double CalculatePerimeter2()
    {
        double result = 0;

        for (int i = 0; i <points2.length; i++) {
            result += CalculateSideLength2(points2[i], points2[(i+1)%points2.length]);
        }

        return result;
    }
    public double CalculatePerimeter3()
    {
        double result = 0;

        for (int i = 0; i <points3.length; i++) {
            result += CalculateSideLength3(points3[i], points3[(i+1)%points3.length]);
        }

        return result;
    }
}